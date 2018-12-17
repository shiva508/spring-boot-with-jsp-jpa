package com.web.ldap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ldap.dao.TagDao;
import com.web.ldap.model.entityinheritance.Tag;

@Service
public class TagServiceImpl implements TagService {
	@Autowired
	TagDao tagDao;

	@Transactional
	@Override
	public void saveTag(Tag tag) {
		tagDao.saveTag(tag);
	}

	@Transactional
	@Override
	public Tag getTag(String referencace) {
		return tagDao.getTag(referencace);
	}

}
