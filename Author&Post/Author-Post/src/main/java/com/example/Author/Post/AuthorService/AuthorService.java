package com.example.Author.Post.AuthorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Author.Post.Author.AuthorModel;
import com.example.Author.Post.AuthorDto.AuthorDto;
import com.example.Author.Post.AuthorRepository.AuthorRepository;
import com.example.Author.Post.Mapper.AuthorDtoMapper;
import com.example.Author.Post.Post.PostRepository;
@Service
public class AuthorService {
		@Autowired
		AuthorRepository authorRepository;
		@Autowired
		PostRepository postRepository;
		
		public AuthorModel getAuthorById(int id) {
			
			return this.authorRepository.findById(id).get();
		}
		public List<AuthorDto> getAllAuthor()   
		{  
			List<AuthorDto> authorDtos = null;
			Iterable<AuthorModel> authorItr = this.authorRepository.findAll();
			List<AuthorModel> authors = (List<AuthorModel>) authorItr;		
			authorDtos = AuthorDtoMapper.mapAuthorToAuthorDtos(authors);
			return authorDtos;  
		}
		
		public AuthorDto getAuthorDtoById(int id)   
		{  
			AuthorModel author= authorRepository.findById(id).get();
			return AuthorDtoMapper.mapAuthorToAuthorDto(author);
		}   
		
		public AuthorDto saveAuthor(AuthorDto authorDto)   
		{  
			AuthorModel author=AuthorDtoMapper.mapAuthorDtoToAuthor(authorDto);
			author=authorRepository.save(author);  
			AuthorDtoMapper.mapAuthorToAuthorDto(author);
			return authorDto;
		}  
		
		public void deleteAuthor(int id)   
		{  
			authorRepository.deleteById(id);  
		}   
		
	    public AuthorDto updateAuthor(AuthorDto authorDto) 
	    {
	    	AuthorModel oldAuthor=this.getAuthorById(authorDto.getId());
	    	oldAuthor.setFirst_name(authorDto.getFirst_name());
	    	oldAuthor.setLast_name(authorDto.getLast_name());
	    	oldAuthor.setEmail(authorDto.getEmail());
	    	oldAuthor.setBirthdate(authorDto.getBirthdate());
	    	oldAuthor.setAdded(authorDto.getAdded());
	        oldAuthor=authorRepository.save(oldAuthor);
	        return AuthorDtoMapper.mapAuthorToAuthorDto(oldAuthor);
	       
	    }
}
