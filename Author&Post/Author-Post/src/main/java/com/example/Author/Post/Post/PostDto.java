package com.example.Author.Post.Post;

import java.io.Serializable;

import com.example.Author.Post.Author.AuthorModel;

public class PostDto implements Serializable{
	private int post_id;
	private String title;
	private String description;
	private String content;
	private String date;
	private AuthorModel author;
	
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public AuthorModel getAuthor() {
		return author;
	}
	public void setAuthor(AuthorModel author) {
		this.author = author;
	}
	

}
