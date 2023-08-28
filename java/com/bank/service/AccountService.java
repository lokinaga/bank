package com.bank.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.AccountDao;
import com.bank.entity.Account;
@Service
public class AccountService {
	@Autowired
	AccountDao ad;
	public String setAcc(Account account) {
		return ad.setAcc(account);
		
	}
	public String setAllAcc(List<Account> accounts) {
		
		return ad.setAllAcc(accounts);
	}
	public List<Account> getAllAcc() {
		
		return ad. getAllAcc();
	}
	public Account getById(int a) {
		
		return ad.getById(a);
	}
	public List<Account> getByAccNo(long b) {
		
		return ad.getByAccNo(b);
	}
	public List<Account> getAccByName(String c) {
	List<Account> g = getAllAcc();
	List<Account> h = g.stream().filter(x -> x.getName().equalsIgnoreCase(c)).collect(Collectors.toList());
		return h;
	}
	public List<Account> getMax() {
		
		return ad.getMax();
	}
	public List<Account> getMin() {
		
		return ad.getMin();
	}

}
