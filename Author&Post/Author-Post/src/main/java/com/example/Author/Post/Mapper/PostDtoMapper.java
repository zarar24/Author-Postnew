package com.example.Author.Post.Mapper;
import java.util.ArrayList;
import java.util.List;

import com.example.Author.Post.Author.AuthorModel;
import com.example.Author.Post.AuthorDto.AuthorDto;
import com.example.Author.Post.Post.Post;
import com.example.Author.Post.Post.PostDto;

public class PostDtoMapper {
	public static Post mapPostDtoToPost(PostDto postDto) {
		Post post = new Post();
		post.setPostId(postDto.getPost_id());
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		post.setDate(postDto.getDate());
		return post;
	}
	
	public static PostDto mapPostToPostDto(Post post) {	
		PostDto postDto = new PostDto();
		postDto.setPost_id(post.getPostId());
		postDto.setTitle(post.getTitle());
		postDto.setDescription(post.getDescription());
		postDto.setContent(post.getContent());
		postDto.setDate(post.getDate());
		return postDto;
	}
	
	public static List<PostDto> mapPostToPostDtos(List<Post> posts) {
		List<PostDto> postDtos = new ArrayList<>();
		for (Post post : posts) {
			postDtos.add(mapPostToPostDto(post));
		}
		
		return postDtos;
	}
	
	public static List<Post> mapPostDtosToPost(List<PostDto> postDtos) {
		List<Post> post = new ArrayList<>();

		for (PostDto postDto : postDtos) {
			post.add(mapPostDtoToPost(postDto));
		}
		
		return post;
	}

}
