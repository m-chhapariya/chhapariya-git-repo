package com.myblog.poetry.model;

import java.time.Clock;
import java.time.LocalDateTime;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document("comments")
public class Comments {

	@Id
	@JsonIgnore
	private int id;
	
	private int subscriberId;
	
	private int postId;
	
	private LocalDateTime dateTimeofComment;
	
	@Size(min=5, max=100)
	private String comment;

	protected Comments() {}
	
	public Comments(int subscriberId, int postId, @Size(min = 5, max = 100) String comment) {
		this.subscriberId = subscriberId;
		this.postId = postId;
		this.comment = comment;
		this.dateTimeofComment = LocalDateTime.now(Clock.systemDefaultZone());
	}

	public int getId() {
		return id;
	}

	public int getSubscriberId() {
		return subscriberId;
	}

	public int getPostId() {
		return postId;
	}

	public LocalDateTime getDateTimeofComment() {
		return dateTimeofComment;
	}

	public String getComment() {
		return comment;
	}
	
}
