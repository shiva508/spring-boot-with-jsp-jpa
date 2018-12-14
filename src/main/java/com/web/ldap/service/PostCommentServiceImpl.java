package com.web.ldap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ldap.dao.PostCommentDao;
import com.web.ldap.model.entityinheritance.PostComment;
@Service
public class PostCommentServiceImpl implements PostCommentService{
	@Autowired
PostCommentDao postCommentDao;
	@Override
	public void savePostComment(PostComment postComment) {
		postCommentDao.savePostComment(postComment);
		
	}

}
