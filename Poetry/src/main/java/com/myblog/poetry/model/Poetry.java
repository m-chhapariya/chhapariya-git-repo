package com.myblog.poetry.model;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document("ghazals")
public class Poetry {

	@Id
	@JsonIgnore
	private int id;
	
	@Indexed(unique = true)
	private String title;
	
	private String content;
	
	private LocalDateTime dateTime;
	
	private int likes;
	
	private String imageTitle;
	
	private List<Comments> comments;
	
	protected Poetry() {}

	public Poetry(String title, String content) {
		this.title = title;
		this.content = content;
		dateTime = LocalDateTime.now(Clock.systemDefaultZone());
		this.likes = 0;
		this.comments = new ArrayList<>();
	}
	
	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public String getImageTitle() {
		return imageTitle;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public static String getAuthor() {
		return author;
	}

	private static final String author = "MRHamsafar"; 
	
}
