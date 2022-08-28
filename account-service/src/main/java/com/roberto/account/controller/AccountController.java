package com.roberto.account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roberto.account.model.Account;
import com.roberto.account.service.AccountService;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class AccountController {
	
	private final AccountService accountService;

	@PostMapping("/customer/{id}")
	public ResponseEntity<Account> getAccountDetails(@PathVariable Long id) {

		return new ResponseEntity<Account>(accountService.getAccountByCustomerId(id), HttpStatus.OK);

	}

}
