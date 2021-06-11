package com.example.Author.Post.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Author.Post.Author.AuthorModel;
import com.example.Author.Post.AuthorRepository.AuthorRepository;
import com.example.Author.Post.Mapper.PostDtoMapper;
@Service
public class PostService {
	@Autowired
	PostRepository postRepository;
	@Autowired
	AuthorRepository authorRepository;
	
	public List<PostDto> getAllPost(int auth_id)   
	{ 
		AuthorModel author=authorRepository.getOne(auth_id);  
	 return PostDtoMapper.mapPostToPostDtos(author.getPosts());
	}  
	public PostDto getPostByAuthorId(int auth_id,int post_id)   
	{  
//		AuthorModel author=authorRepository.getOne(auth_id);
		Post post=  postRepository.getOne(post_id);
		return PostDtoMapper.mapPostToPostDto(post);
	}   
	public PostDto savePost(int auth_id,PostDto postDto) 
	{  
		AuthorModel author=authorRepository.getOne(auth_id);
		Post post=PostDtoMapper.mapPostDtoToPost(postDto);
		post.setAuthor(author);
		author.getPosts().add(post);
		authorRepository.save(author);
		return postDto;
		
	}  
	public void deletePost(int auth_id,int post_id)   
	{  
//	AuthorModel author=authorRepository.getOne(auth_id);
//	Post post=postRepository.getOne(post_id);
		postRepository.deleteById(post_id);	
	  
	}   
    public PostDto updatePost(int auth_id,PostDto postDto,int post_id) {
    	AuthorModel author=authorRepository.getOne(auth_id);
    	Post post=postRepository.findById(post_id);
    	post.setAuthor(author);
    	post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		post.setDate(postDto.getDate());
        postRepository.save(post);
        return postDto;
       
    }

}
