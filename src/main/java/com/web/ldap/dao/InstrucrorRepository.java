package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.Instrucror;
@Repository
public interface InstrucrorRepository extends JpaRepository<Instrucror, Integer> {

}
