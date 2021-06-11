package com.example.Author.Post.Mapper;

import java.util.ArrayList;
import java.util.List;

import com.example.Author.Post.Author.AuthorModel;
import com.example.Author.Post.AuthorDto.AuthorDto;
public class AuthorDtoMapper {
	public static AuthorModel mapAuthorDtoToAuthor(AuthorDto authorDto) {
		AuthorModel author = new AuthorModel();
		author.setId(authorDto.getId());
		author.setFirst_name(authorDto.getFirst_name());
		author.setLast_name(authorDto.getLast_name());
		author.setEmail(authorDto.getEmail());
		author.setBirthdate(authorDto.getBirthdate());
		author.setAdded(authorDto.getAdded());
		return author;
	}
	
	public static AuthorDto mapAuthorToAuthorDto(AuthorModel author) {
		AuthorDto authorDto = new AuthorDto();
		authorDto.setId(author.getId());
		authorDto.setFirst_name(author.getFirst_name());
		authorDto.setLast_name(author.getLast_name());
		authorDto.setEmail(author.getEmail());
		authorDto.setBirthdate(author.getBirthdate());
		authorDto.setAdded(author.getAdded());
		return authorDto;
	}
	
	public static List<AuthorDto> mapAuthorToAuthorDtos(List<AuthorModel> authors) {
		List<AuthorDto> authorDtos = new ArrayList<>();
		for (AuthorModel author : authors) {
			authorDtos.add(mapAuthorToAuthorDto(author));
		}
		
		return authorDtos;
	}

//	public static List<AuthorModel> mapAuthorDtosToAuthor(List<AuthorDto> authorDtos) {
////		if(Util.isNull(optionDtos)) {
////			return new ArrayList<>();
////		}
//		
//		List<AuthorModel> author = new ArrayList<>();
//
//		for (AuthorDto authorDto : authorDtos) {
//			author.add(mapAuthorDtoToAuthor(authorDto));
//		}
//		
//		return author;
//	}
}
