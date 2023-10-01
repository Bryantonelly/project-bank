package com.nttdata.escuela.java.projectbank.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Personal extends Customer{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId; 
	private String firstName; 
    private String lastName; 
    private String middleName; 
}
