package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Article;
import com.example.demo.repository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	public List<Article> getAllArticles() {
		return articleRepository.getAllArticles();
	}
		
}
