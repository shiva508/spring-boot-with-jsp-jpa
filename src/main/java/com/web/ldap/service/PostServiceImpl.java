package com.web.ldap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ldap.dao.PostDao;
import com.web.ldap.model.entityinheritance.Post;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	PostDao postDao;

	@Transactional
	@Override
	public void savePost(Post post) {
		postDao.savePost(post);
	}

}
