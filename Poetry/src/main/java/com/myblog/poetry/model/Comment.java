package com.myblog.poetry.model;

import java.time.Clock;
import java.time.LocalDateTime;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document("comments")
public class Comment {

	@Id
	private int id;
	
	@ManyToOne
	private int subscriberId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Subscriber subscriber;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Post post;
	
	private LocalDateTime dateTimeofComment;
	
	@Size(min=5, max=100)
	private String comment;

	protected Comment() {}
	
	public Comment(int subscriberId, Post post, @Size(min = 5, max = 100) String comment) {
		this.subscriberId = subscriberId;
		this.post = post;
		this.comment = comment;
		this.dateTimeofComment = LocalDateTime.now(Clock.systemDefaultZone());
	}

	public int getId() {
		return id;
	}

	public int getSubscriberId() {
		return subscriberId;
	}

	public Post getPost() {
		return post;
	}

	public LocalDateTime getDateTimeofComment() {
		return dateTimeofComment;
	}

	public String getComment() {
		return comment;
	}
	
}
