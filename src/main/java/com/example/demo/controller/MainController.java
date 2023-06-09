package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.ArticleService;

@Controller
public class MainController {
	
	@Autowired
	private ArticleService articleService; 
	
	 @GetMapping("/index")
	 public String index(Model model) {
		 model.addAttribute("articles", articleService.getAllArticles());
		 return "index";
	 }
	 
	 @GetMapping("/article/show")
	 public String article(Model model) {
		 model.addAttribute("articles", articleService.getAllArticles());
		 return "index";
	 }
	 
	 @GetMapping("/article/show/{id}")
	 public String article(Model model, @PathVariable Long id) {
		 model.addAttribute("article", articleService.getArticleById(id));
		 return "articleview";
	 }
	 
	 
	 
	
}
