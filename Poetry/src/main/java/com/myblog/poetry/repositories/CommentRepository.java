package com.myblog.poetry.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myblog.poetry.model.Comments;

@Repository
public interface CommentRepository extends MongoRepository<Comments, Integer>{

	List<Comments> findByPostId(int postId);
	List<Comments> findBySubscriberId(int subscriberId);
	Comments findOne(int id);
}
