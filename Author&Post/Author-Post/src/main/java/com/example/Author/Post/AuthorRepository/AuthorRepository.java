package com.example.Author.Post.AuthorRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Author.Post.Author.AuthorModel;
public interface AuthorRepository extends JpaRepository<AuthorModel,Integer>{
	
	AuthorModel getById(int auth_id);
}
