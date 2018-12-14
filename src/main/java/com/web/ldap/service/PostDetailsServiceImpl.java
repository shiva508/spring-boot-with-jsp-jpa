package com.web.ldap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ldap.dao.PostDetailsDao;
import com.web.ldap.model.entityinheritance.PostDetails;

@Service
public class PostDetailsServiceImpl implements PostDetailsService {
	@Autowired
	PostDetailsDao postDetailsDao;

	@Transactional
	@Override
	public void savePostDetail(PostDetails postDetail) {
		
		postDetailsDao.savePostDetail(postDetail);
	}

}
