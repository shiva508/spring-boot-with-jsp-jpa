package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.embeddable.Elephant;
@Repository
public interface ElephantRepository extends JpaRepository<Elephant, Integer>{

}
