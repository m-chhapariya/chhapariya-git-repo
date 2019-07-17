package com.myblog.poetry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myblog.poetry.model.Comment;
import com.myblog.poetry.model.Post;
import com.myblog.poetry.model.Subscriber;
import com.myblog.poetry.repositories.CommentRepository;
import com.myblog.poetry.repositories.PostRepository;
import com.myblog.poetry.repositories.SubscriberRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Autowired 
	private SubscriberRepository subsRepository;
	
	public Comment getById(int id) {
		return commentRepository.findById(id);
	}
	
	public List<Comment> getByPost(Post post) {
		Post tempPost = postRepository.findById(post.getId());
		if(tempPost!=null) {
			return commentRepository.findByPostId(post.getId());
		}
		return null;
	}
	
	public List<Comment> getBySubscriber(Subscriber subscriber) {
		Subscriber tempSubscriber = subsRepository.findById(subscriber.getId());
		if(tempSubscriber!=null) {
			return commentRepository.findByPostId(subscriber.getId());
		}
		return null;
	}
	
	
}
