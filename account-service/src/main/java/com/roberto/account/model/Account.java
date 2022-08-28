package com.roberto.account.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Data
@Entity(name = "account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="costumer_id")
	private Long customerId;
	
	@Column(name="type")
	private String type;
	
	@Column(name="branch_address")
	private String branchAddress;
	
	@Column(name="created_date")
	@CreatedDate
	private LocalDate createdDate;
	
}
