package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {
    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("body")
    @Expose
    private String body;

    @SerializedName("field_image")
    @Expose
    private String field_image;

    @SerializedName("created")
    @Expose
    private String created;

    @SerializedName("uid")
    @Expose
    private String uid;

    @SerializedName("field_category")
    @Expose
    private String field_category;

    public Article(String title, String body, String field_image, String created, String uid, String field_category) {
        this.title = title;
        this.body = body;
        this.field_image = field_image;
        this.created = created;
        this.uid = uid;
        this.field_category = field_category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getField_image() {
        return field_image;
    }

    public void setField_image(String field_image) {
        this.field_image = field_image;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getField_category() {
        return field_category;
    }

    public void setField_category(String field_category) {
        this.field_category = field_category;
    }
}
