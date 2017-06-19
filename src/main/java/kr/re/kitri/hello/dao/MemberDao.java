package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class MemberDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updatePoint(int memberSeq) {
        String query =
                "update member set point = point + 10\n" +
                        "where member_seq = ?;";
        jdbcTemplate.update(query, memberSeq);
    }

    public void insertMember(Member member) {
        String query =
                "insert into member(userId, password, email, join_date)\n" +
                        "VALUES (?, ?, ?, now());";

        jdbcTemplate.update(query, member.getUserId(), member.getPassword(), member.getEmail());
    }



}
