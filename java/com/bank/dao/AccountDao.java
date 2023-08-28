package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Account;
import com.bank.jpa.AccountRepository;

@Repository
    public class AccountDao {
	@Autowired
	AccountRepository ar;

	public String setAcc(Account account) {

		 ar.save(account);
		 return "saved account";
	}

	public String setAllAcc(List<Account> accounts) {
		ar.saveAll(accounts);
		return "saved";
	}

	public List<Account> getAllAcc() {
		
		return ar.findAll();
	}

	public Account getById(int a) {
		
		return ar.findById(a).get();
	}

	public List<Account> getByAccNo(long b) {
		
		return ar.findByAccNo(b);
	}

	public List<Account> getMax() {
		
		return ar.findMax();
	}

	public List<Account> getMin() {
		
		return ar.findMin();
	}



	
	
	}

