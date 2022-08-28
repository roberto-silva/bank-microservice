package com.roberto.account.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roberto.account.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

	Optional<Account> findAccountByCustomerId(Long customerId);

}
