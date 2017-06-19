package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class PostDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insertPost(Post post) {
        String query =
                "INSERT into post(title, post_content, write_date, member_seq)\n" +
                        "VALUES (?, ?, now(), ?);";

        jdbcTemplate.update(query,
                post.getTitle(),
                post.getPost_content(),
                post.getWrite_date(),
                post.getMember_seq());
    }


    public Post selectPostById(String postSeq) {

        String query = " select * from post where post_seq = ?";
        return jdbcTemplate.queryForObject(query, (rs, i) -> {
            Post post = new Post();
            post.setPostSeq(rs.getInt(1));
            post.setTitle(rs.getString(2));
            post.setWrite_date(rs.getDate(3));
            post.setMember_seq(rs.getInt(4));
            return post;
        },  Integer.parseInt(postSeq));
    }


    public List<Post> selectAllPosts() {
        String query = "select title, post_content, write_date from post;";

        return jdbcTemplate.query(query,(rs, i) -> {
            Post post = new Post();
            post.setPostSeq(rs.getInt(1));
            post.setTitle(rs.getString(2));
            post.setWrite_date(rs.getDate(3));
            post.setMember_seq(rs.getInt(4));
            return post;
        });


    }


}
