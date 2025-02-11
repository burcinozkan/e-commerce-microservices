package com.trade.e_trade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ETradeMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ETradeMicroservicesApplication.class, args);
	}
	@Autowired
	private JdbcTemplate jdbcTemplate;




}
