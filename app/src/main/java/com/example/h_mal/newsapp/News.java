package com.example.h_mal.newsapp;

/**
 * Created by h_mal on 16/03/2017.
 */

public class News {

    private String mTitle;

    private String mSection;

    private String mURLaddress;

    public News (String title, String section, String URLaddress){

        mTitle = title;
        mSection = section;
        mURLaddress = URLaddress;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection; }

    public String getURLaddress() {
        return mURLaddress;}
}
