package me.catzy.invester.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import me.catzy.invester.master.domain.article.Article;

@RepositoryRestResource(collectionResourceRel = "article", path = "article")
public interface ArticleRepository extends JpaRepository<Article, Long> {
	public Article findByUrl(String url);
	public List<Article> findByEventsIsEmptyAndContentIsNotNullOrderByTimestampDesc();
}
