package ru.netology.domain;

import java.time.LocalDateTime;


public class Post {
    private int postId;
    private String postName;
    private String postDescription;
    private String imageURL;
    private String readLinkButtonURL;
    private int likeCount;
    private int viewCount;
    private CommentsInfo commentsInfo;
    private static LocalDateTime localDateTime=LocalDateTime.now();

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getReadLinkButtonURL() {
        return readLinkButtonURL;
    }

    public void setReadLinkButtonURL(String readLinkButtonURL) {
        this.readLinkButtonURL = readLinkButtonURL;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void share() {

    }
    public void editPost(Post post){

    }




}
