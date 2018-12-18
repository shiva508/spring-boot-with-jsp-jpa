package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.joinformula.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
