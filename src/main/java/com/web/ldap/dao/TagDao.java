package com.web.ldap.dao;

import com.web.ldap.model.entityinheritance.Tag;

public interface TagDao {
public void saveTag(Tag tag);
public Tag getTag(String referencace);
}
