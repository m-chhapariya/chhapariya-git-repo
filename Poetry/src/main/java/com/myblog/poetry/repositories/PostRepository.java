package com.myblog.poetry.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myblog.poetry.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer>{

	Post findById(int id);
	Post findByTitle(String title); 
	List<Post> findByLikes(int likeCount);
	List<Post> findByContent(String content);
	//Below 2 are for search option
	List<Post> findByTitleLikeOrderByLikesDesc(String title);
	List<Post> findByContentLikeOrderByLikesDesc(String content);
}
