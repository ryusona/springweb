package kr.re.kitri.hello.model;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public class Post {

    private int post_seq;
    private String title;
    private String post_content;
    private Date write_date;
    private int member_seq;

    public int getPost_seq() {
        return post_seq;
    }

    public void setPost_seq(int post_seq) {
        this.post_seq = post_seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public Date getWrite_date() {
        return write_date;
    }

    public void setWrite_date(Date write_date) {
        this.write_date = write_date;
    }

    public int getMember_seq() {
        return member_seq;
    }

    public void setMember_seq(int member_seq) {
        this.member_seq = member_seq;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_seq=" + post_seq +
                ", title='" + title + '\'' +
                ", post_content='" + post_content + '\'' +
                ", write_date=" + write_date +
                ", member_seq=" + member_seq +
                '}';
    }

}
