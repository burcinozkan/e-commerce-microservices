package com.trade.e_trade.repository;

import com.trade.e_trade.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
