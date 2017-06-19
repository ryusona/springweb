package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.MemberService;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private PostService postService;

    @GetMapping("")
    public String memberIndex() {
        return "member/login";
    }

    @PostMapping("")
    public String amigoIndex() {
        return "member/login";
    }


    @GetMapping("/write")
    public String mainPage() { return "member/write";}

    @PostMapping("/write") //실제 입력하는 곳
    public ModelAndView submitPage(Member member){

        System.out.println(member);

        memberService.registMember(member);

        return new ModelAndView("/member/member_finish").addObject("member", member);
    }


    @PostMapping("/sign-up") //실제 입력하는 곳
    public ModelAndView finishwrite(Member member){

        System.out.println(member);

        memberService.registMember(member);

        return new ModelAndView("/member/member_finish").addObject("member", member);
    }

    @RequestMapping("")
    public ModelAndView viewAll() {

        //전체보기를 하기위한 데이터를 가져온다.

        List<Post> list = memberService.getPosts();

        return new ModelAndView("member/view_all")
                .addObject("list",list);
    }



}
