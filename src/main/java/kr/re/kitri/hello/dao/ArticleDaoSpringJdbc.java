package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ArticleDaoSpringJdbc implements ArticleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertArticle(Article article) {

        String query =
                "insert into post (title, post_content, write_date, member_seq)\n" +
                        "VALUES (?, ?, ?, ?);" +
                        "UPDATE member" +
                        "SET point = point + 10\n" +
                        "WHERE member_seq = ? ;";
        jdbcTemplate.update(
                query,
                Integer.parseInt(article.getArticleId()),
                article.getTitle(),
                article.getAuthor(),
                article.getContent());
    }

    @Override
    public Article selectArticleById(String articleId) {

        String query = " select * from article where article_id = ?";
        return jdbcTemplate.queryForObject(query, (rs, i) -> {
            Article article = new Article();
            article.setArticleId(rs.getString(1));
            article.setTitle(rs.getString(2));
            article.setAuthor(rs.getString(3));
            article.setContent(rs.getString(4));
            return article;
        },  Integer.parseInt(articleId));
    }

    @Override
    public List<Article> selectAllArticles() {
        String query = "select article_id,title, author, content from article;";

                return jdbcTemplate.query(query,(rs, i) -> {
                        Article article = new Article();
                        article.setArticleId(rs.getString(1));
                        article.setTitle(rs.getString(2));
                        article.setAuthor(rs.getString(3));
                        article.setContent(rs.getString(4));
                        return article;
                });


    }

    @Override
    public List<Article> selectAllArticles(String articleId) {
        return null;
    }
}