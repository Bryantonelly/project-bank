package com.nttdata.escuela.java.projectbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Empresarial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId; 
    private String businessName; 
    private String accountHolder; 

}
