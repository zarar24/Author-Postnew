package com.example.Author.Post.Post;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Integer> {

	Post findById(int post_id);

	Post getOne(int post_id);
}
