package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    List<Post> posts = new ArrayList<>() {{
        add(new Post(0,"Котики - это круто", new Date()));
        add(new Post(1,"Собачки - это круто", new Date()));
        add(new Post(2,"Птички - это круто",  new Date()));
    }};

    public List<Post> listAllPosts() {

        return posts;
    }
    public void create(String text) {

        posts.add(new Post(posts.size(),text,  new Date()));
    }
}
