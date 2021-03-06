package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import kr.re.kitri.hello.dao.PostDao;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by danawacomputer on 2017-06-16.
 */

@Service
public class PostService {

    @Autowired
    private PostDao postDao;
    /**
     * 글을 등록하고, 글쓴 멤버에게 포인트 10점 추가
     * */
    public void registPost(Post post) {
        postDao.insertPost(post);
    }

}
