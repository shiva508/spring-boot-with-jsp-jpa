package com.web.ldap.model.joinformula;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private String title;
 
    @OneToMany(mappedBy = "book")
    private List<Review> reviews = new ArrayList<Review>();
}
