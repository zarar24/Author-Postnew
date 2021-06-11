package com.example.Author.Post.AuthorDto;
import java.io.Serializable;
import java.util.List;
import com.example.Author.Post.Post.PostDto;
public class AuthorDto implements Serializable{
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String birthdate;
	private String added;
	private List<PostDto> posts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public List<PostDto> getPosts() {
		return posts;
	}
	public void setPosts(List<PostDto> posts) {
		this.posts = posts;
	}
	

}
