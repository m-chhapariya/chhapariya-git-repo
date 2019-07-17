package com.myblog.poetry.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myblog.poetry.model.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, Integer>{

	List<Comment> findByPostId(int postId);
	List<Comment> findBySubscriberId(int subscriberId);
	Comment findById(int id);
}
