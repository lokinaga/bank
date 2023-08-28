package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Account;
import com.bank.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService as;

	@PostMapping(value = "/setAcc")
	public String setAcc(@RequestBody Account account) {
		return as.setAcc(account);
	}

	@PostMapping(value = "/setAllAcc")
	public String setAllAcc(@RequestBody List<Account> accounts) {
		return as.setAllAcc(accounts);

	}

	@GetMapping(value = "/getAllAcc")
	public List<Account> getAllAcc() {
		return as.getAllAcc();
	}

	@GetMapping(value = "/getById/{a}")
	public Account getById(@PathVariable int a) {

		return as.getById(a);
	}
	@GetMapping(value ="/getByAccNo/{b}")
	public List<Account> getByAccNo(@PathVariable long b){
		return as.getByAccNo(b);
	
	
}
	@GetMapping(value="/getAccByName/{c}")
	public List<Account> getAccByName(@PathVariable String c){
		return as.getAccByName(c);
		
	}
	@GetMapping(value="/getMax")
	public List<Account> getMax(){
		return as.getMax();
	}
	@GetMapping(value="/getMin")
	public List<Account> getMin(){
		return as.getMin();
		
	}
}