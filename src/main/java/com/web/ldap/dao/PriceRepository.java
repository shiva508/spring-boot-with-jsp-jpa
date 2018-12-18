package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.joinformula.Price;
@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

}
