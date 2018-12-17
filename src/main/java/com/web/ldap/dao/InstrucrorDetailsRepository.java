package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.onetoone.InstrucrorDetails;
@Repository
public interface InstrucrorDetailsRepository extends JpaRepository<InstrucrorDetails, Integer> {

}
