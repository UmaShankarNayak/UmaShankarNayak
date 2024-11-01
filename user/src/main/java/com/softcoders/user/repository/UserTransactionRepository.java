package com.softcoders.user.repository;

import com.softcoders.user.entity.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserTransactionRepository extends JpaRepository<UserTransaction, Integer> {

    UserTransaction findByUserId(int userId);

}
