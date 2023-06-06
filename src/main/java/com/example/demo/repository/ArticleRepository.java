package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
	
	@Query(value="Select * From Articles", nativeQuery=true)
	List<Article> getAllArticles();
	
	@Query(value="Select * From Articles a Where a.id = :id", nativeQuery = true)
	Article getArticleById(@Param("id") Long id); 
		
	
	
}
