package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import kr.re.kitri.hello.dao.PostDao;
import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;
    @Autowired
    private PostDao postDao;


    public void registMember(Member member) {
        memberDao.insertMember(member);

    }

    public void insertPost(Post post) {
        postDao.insertPost(post);
        memberDao.updatePoint(post.getMember_seq());
    }

    /**
     * 글 전체 보기
     * @return 전체 글
     */

    public List<Post> getPosts() { return postDao.selectAllPosts(); }

    /**
     * 상세 글 보기
     * @param post_seq 글 번호
     * @return 글 객체
     */
    public Post viewPost(String post_seq) {

        return postDao.selectPostById(post_seq);
    }
}
