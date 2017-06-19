package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public interface ArticleDao {

    void insertArticle(Article article);
    List<Article> selectAllArticles();

    List<Article> selectAllArticles(String articleId);

    Article selectArticleById(String articleId);
}
