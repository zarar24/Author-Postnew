package com.example.Author.Post.Post;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.example.Author.Post.Author.AuthorModel;
@Entity
@Table(name = "posts")
public class Post implements Serializable{
	@Id
	@GeneratedValue
	private int post_id;
	private String title;
	private String description;
	private String content;
	private String date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private AuthorModel author;
	public int getPostId() {
		return post_id;
	}
	public void setPostId(int post_id) {
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
