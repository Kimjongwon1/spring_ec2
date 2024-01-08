package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
    public class PostController {
        private PostService postService;

    public PostController() {
        this.postService = new PostService();
    }

    @GetMapping("/csr/json")
    @ResponseBody
    public List<Post> findAll(){
        return postService.findAll();
    }

    //
    @GetMapping("/ssr")
    public String findAllssr(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("post_list",posts);
        return "post_list";
    }
//
}

