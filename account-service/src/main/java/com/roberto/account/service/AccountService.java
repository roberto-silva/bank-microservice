package com.roberto.account.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.roberto.account.model.Account;
import com.roberto.account.repository.AccountRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountService {
	
	private final AccountRepository accountsRepository;
	
	public Account getAccountByCustomerId(Long id) {
		return accountsRepository.findAccountByCustomerId(id).orElseThrow(() -> new EntityNotFoundException("Account not found."));
	}
	
}
