package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.embeddable.Lion;
@Repository
public interface LionRepository extends JpaRepository<Lion, Integer> {

}
