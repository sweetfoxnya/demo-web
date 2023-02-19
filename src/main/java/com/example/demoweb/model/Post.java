package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Integer id;

    public Post(Integer id,String text, Date date) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }

    public String getText(){ return text; }

    public Integer getLikes(){ return likes; }

    public Date getCreationDate(){ return creationDate; }
    public Integer getId(){ return id; }


    public void setText(String text) {this.text = text;}
    public void setLikes(Integer likes) {this.likes = likes;}
    public void setCreationDate(Date date) {this.creationDate = date;}

}
