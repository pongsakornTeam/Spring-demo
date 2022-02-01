package com.example.springbootbackend.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springbootbackend.repository.ContentRepository;

public class ContentService {
	
	private ContentRepository contentRepository;
	
	@Autowired
	public ContentService(ContentRepository contentRepository) {
		this.contentRepository = contentRepository;
	}
}
