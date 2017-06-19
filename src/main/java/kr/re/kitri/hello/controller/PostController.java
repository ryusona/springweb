//package kr.re.kitri.hello.controller;
//
//import kr.re.kitri.hello.model.Post;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
///**
// * Created by danawacomputer on 2017-06-16.
// */
//@Controller
//@RequestMapping("/post")
//public class PostController {
//
//    @RequestMapping("")
//    public ModelAndView viewAll() {
//
//        //전체보기를 하기위한 데이터를 가져온다.
//
//        List<Post> list = service.getArticles();
//
//        return new ModelAndView("post/view_all")
//                .addObject("list",list);
//    }
//
//}
