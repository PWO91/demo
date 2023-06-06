package com.example.demo.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Articles")
public class Article {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String content;
	private Timestamp createdate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	
	
}
