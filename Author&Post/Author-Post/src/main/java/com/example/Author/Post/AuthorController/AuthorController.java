package com.example.Author.Post.AuthorController;
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
import com.example.Author.Post.AuthorDto.AuthorDto;
import com.example.Author.Post.AuthorService.AuthorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/authors")
public class AuthorController {
	@Autowired  
	AuthorService authorService;
	@GetMapping("")  
	private List<AuthorDto> getAllAuthor()   
	{  
	return authorService.getAllAuthor();  
	}
	@GetMapping("/{id}")  
	private AuthorDto getAuthor(@PathVariable("id") int id)   
	{  
	return authorService.getAuthorDtoById(id);  
	}
	@DeleteMapping("/{id}")  
	private void deleteAuthor(@PathVariable("id") int id)   
	{  
	authorService.deleteAuthor(id);
	}
	@PostMapping("")  
	private AuthorDto createAuthor(@RequestBody AuthorDto authorDto)   
	{  
	authorService.saveAuthor(authorDto);  
	return authorDto;  
	}
	@PutMapping("/{id}")  
    private AuthorDto updateAuthor(@RequestBody AuthorDto authorDto,@PathVariable("id") int id) {  
        authorService.updateAuthor(authorDto);
        return authorDto;
    } 
	
}
