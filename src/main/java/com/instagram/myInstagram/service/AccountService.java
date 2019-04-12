package com.instagram.myInstagram.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.myInstagram.model.Account;
import com.instagram.myInstagram.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	public List<Account> getAccounts(){
		List<Account> account= new LinkedList<>();
		accountRepository.findAll().forEach(account::add);
		return account;
	}
	public Optional<Account> getAccount(String id){
		return accountRepository.findById(id);
	}
	public void add(Account account) {
	//	if(account.getEmail() != null)
		accountRepository.save(account);
	}
	public void updateAccount(String id, Account account) {
		accountRepository.save(account);		
	}
	public void deleteAccount(String id) {
		//Accounts.removeIf(x -> x.getId().equals(id));
		accountRepository.deleteById(id);
	}

}
