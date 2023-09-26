package com.nttdata.escuela.java.projectbank.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId; 
    private String documentType; 
    private String documentNumber; 
//    private CustomerType customerType;

    public enum CustomerType {
        PERSONAL, 
        BUSINESS
    }
}

