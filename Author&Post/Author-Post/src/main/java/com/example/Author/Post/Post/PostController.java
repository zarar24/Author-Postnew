package com.example.Author.Post.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/all_authors")
public class PostController {
	@Autowired  
	PostService postService;
	@GetMapping("/{auth_id}/posts")  
	private List<PostDto> getAllPost(@PathVariable("auth_id") int auth_id)   
	{  
	return postService.getAllPost(auth_id);  
	}
	
	@GetMapping("/{auth_id}/posts/{post_id}")  
	private PostDto getPostByAuthorId(@PathVariable("auth_id") int auth_id,@PathVariable("post_id") int post_id)   
	{  
	return postService.getPostByAuthorId(auth_id,post_id);
	}
	
	@DeleteMapping("/{auth_id}/posts/{post_id}")  
	private void deletePost(@PathVariable("auth_id") int auth_id,@PathVariable("post_id") int post_id)   
	{  
	postService.deletePost(auth_id,post_id);
	}
	
	@PostMapping("/{auth_id}/posts")  
	private PostDto savePost(@PathVariable("auth_id") int auth_id,@RequestBody PostDto postDto)   
	{  
	postService.savePost(auth_id,postDto);  
	return postDto;  
	}
	
	@PutMapping("/{auth_id}/posts/{post_id}")  
    private PostDto updatePost(@PathVariable("auth_id") int auth_id,@RequestBody PostDto postDto,@PathVariable("post_id") int post_id) {   
        postService.updatePost(auth_id,postDto,post_id);
        return postDto;
    }

}
