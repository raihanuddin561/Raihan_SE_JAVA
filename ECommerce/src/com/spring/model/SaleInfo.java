package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="saleInfo")
@Table(name="saleInfo")
public class SaleInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int saleId;
	
}
