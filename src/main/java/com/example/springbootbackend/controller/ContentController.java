package com.example.springbootbackend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.exception.ResourceNotFoundException;
import com.example.springbootbackend.model.Content;
import com.example.springbootbackend.repository.ContentRepository;

@RestController
@RequestMapping("/api/v2/")
public class ContentController {
	@Autowired
	private ContentRepository contentRepository;
	
	@GetMapping("blog")
	public List<Content> getAllBlog(){
		return contentRepository.findAll();
	}
	
	@PostMapping("/blog")
	public Content createBlog(@RequestBody Content content) {
		return contentRepository.save(content);
	}
	
	@DeleteMapping("blog/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteBlog(@PathVariable long id){
		Content content = contentRepository.findById(id).
				orElseThrow(() -> new ResourceNotFoundException(
						"Contetn does not exist with id : " + id));
		contentRepository.delete(content);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
