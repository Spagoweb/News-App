package com.spagoweb.www.newsapp;

/**
 * Created by Robe on 17/10/2017.
 */

public class News {
    /**
     * Title of the news
     */
    private String mTitle;

    /**
     * Title of the news
     */
    private String mAuthor;

    /**
     * Section the news
     */
    private String mSection;

    /**
     * Date and time of news
     */
    private String mDate;

    /**
     * Website URL of the news
     */
    private String mUrl;

    public News(String title, String author, String section, String date, String url) {
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}