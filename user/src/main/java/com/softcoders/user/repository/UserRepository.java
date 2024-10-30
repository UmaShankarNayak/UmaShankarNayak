package com.softcoders.user.repository;

import com.softcoders.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Modifying
    @Query(
            "update users " +
                    "set balance = balance - :amount " +
                    "where id = :userId " +
                    "and balance >= :amount"
    )
    Mono<Boolean> updateUserBalance(int userId, int amount);
}
