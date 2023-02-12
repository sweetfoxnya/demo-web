package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {

        List<Post> list = new ArrayList<>();

        Post post1 = new Post("Котики - это круто",0);
        Post post2 = new Post("Собачки - это круто",0);
        Post post3 = new Post("Птички - это круто",0);

        list.add(post1);
        list.add(post2);
        list.add(post3);
        return list;
    }
}
