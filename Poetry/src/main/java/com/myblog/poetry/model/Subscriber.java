package com.myblog.poetry.model;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document ("Subscribers")
public class Subscriber {

	@Id
	private int id;
	
	@Indexed(unique=true)
	private String name;
	
	private LocalDate dateOfSubscription;

	private String password;

	@Indexed(unique=true)
	private String emailId;
	
	private int visitPerWeek;
	
	private LocalDateTime lastLogin;

	@OneToMany(mappedBy="subscriber")
	private List<Comment> comments;

	protected Subscriber() {}

	public Subscriber(String name, String password, String emailId) {
		this.name = name;
		this.password = password;
		this.emailId = emailId;
		this.dateOfSubscription = LocalDate.now(Clock.systemDefaultZone());
		this.visitPerWeek = 0;
		this.comments = new ArrayList<>();
	}
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	public int getVisitPerWeek() {
		return visitPerWeek;
	}

	public void setVisitPerWeek(int visitPerWeek) {
		this.visitPerWeek = visitPerWeek;
	}
	
	public String getName() {
		return name;
	}

	public LocalDate getDateOfSubscription() {
		return dateOfSubscription;
	}

	public String getPassword() {
		return password;
	}

	public int getId() {
		return id;
	}

	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		return "Subscriber [Name=" + name + "\ndateOfSubscription="
				+ dateOfSubscription + "\nemailId=" + emailId + "]";
	}	
	
}
