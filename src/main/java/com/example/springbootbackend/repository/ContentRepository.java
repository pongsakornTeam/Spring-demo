package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {
	
}
