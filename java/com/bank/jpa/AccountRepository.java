package com.bank.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	@Query(value = "select * from account_details where account_No = ?", nativeQuery = true)
	List<Account> findByAccNo(long b);

	@Query(value = "select * from account_details where available_balance =(select max(available_balance) from account_details)", nativeQuery = true)
	List<Account> findMax();

	@Query(value = "select * from account_details where available_balance = (select min(available_balance) from account_details)", nativeQuery = true)
	List<Account> findMin();

}


