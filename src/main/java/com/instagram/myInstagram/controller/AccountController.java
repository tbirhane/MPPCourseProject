package com.instagram.myInstagram.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.myInstagram.model.Account;
import com.instagram.myInstagram.service.AccountService;

@RestController
public class AccountController {
	
	/**During object creation of this class, this attribute is assigned to the singleton class AccountService*/
	@Autowired
	private AccountService accountService;
	
	/**Get all elements*/
	@RequestMapping("/accounts")
	public List<Account> getAllAccounts() {
		return accountService.getAccounts();
	}
	/**Get the element with id = id*/
	@RequestMapping("/accounts/{id}")
	public Optional<Account> getAccount(@PathVariable String id) {
		return accountService.getAccount(id);
	}
	/**Add a Account to Accounts*/
	@RequestMapping(method=RequestMethod.POST, value="/accounts")
	public void postAccount(@RequestBody Account account) {
		accountService.add(account);
	}
	/**Update a Account to in Accounts*/
	@RequestMapping(method=RequestMethod.PUT, value="/accounts/{id}")
	public void updateAccount(@PathVariable String id, @RequestBody Account account) {
		accountService.updateAccount(id, account);
	}
	
	/**Delete an id with id*/
	@RequestMapping(method=RequestMethod.DELETE, value = "/accounts/{id}")
	public void deleteAccount(@PathVariable String id) {
		 accountService.deleteAccount(id);
	}

}
