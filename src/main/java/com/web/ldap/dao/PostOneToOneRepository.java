package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.onetoone.PostOneToOne;
@Repository
public interface PostOneToOneRepository extends JpaRepository<PostOneToOne, Integer> {

}
