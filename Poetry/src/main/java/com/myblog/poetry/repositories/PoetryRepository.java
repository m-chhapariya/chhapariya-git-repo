package com.myblog.poetry.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myblog.poetry.model.Poetry;

@Repository
public interface PoetryRepository extends MongoRepository<Poetry, Integer>{

	Poetry findByTitle(String title); 
	List<Poetry> findByLikes(int likeCount);
	List<Poetry> findByContent(String content);
	//Below 2 are for search option
	List<Poetry> findByTitleLikeOrderByLikesDesc(String title);
	List<Poetry> findByContentLikeOrderByLikesDesc(String content);
}
