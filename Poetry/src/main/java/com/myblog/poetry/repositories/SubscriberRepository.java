package com.myblog.poetry.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myblog.poetry.model.Subscriber;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface SubscriberRepository extends MongoRepository<Subscriber, ID> {

	List<Subscriber> findAll();
	Subscriber findByEmailId(String email);
	Subscriber findById(int id);
}
