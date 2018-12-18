package com.web.ldap.model.joinformula;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table
public class Review {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private String comment;
 
    @CreationTimestamp
    private LocalDateTime postedAt;
     
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;
}
