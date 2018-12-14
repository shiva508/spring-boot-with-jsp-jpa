package com.web.ldap.service;

import com.web.ldap.model.entityinheritance.Tag;

public interface TagService {
	public void saveTag(Tag tag);
	public Tag getTag(String referencace) ;
}
