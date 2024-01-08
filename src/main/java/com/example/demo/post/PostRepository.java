package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    List<Post> posts;
    PostRepository(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1,"title1","Hello,Java and World","honggildong1"));
        this.posts.add(new Post(2,"title2","Hello,JavaScipt and World","honggildong2"));
        this.posts.add(new Post(3,"title3","Hello,Python and World","honggildong3"));
        this.posts.add(new Post(4,"title4","Hello,Html and World","honggildong4"));
    }

        List<Post> findAll(){
            return this.posts;
        }


}
