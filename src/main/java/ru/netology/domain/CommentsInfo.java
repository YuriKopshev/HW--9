package ru.netology.domain;

import java.time.LocalDateTime;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private String commentDescription;
    private int countLike;
    private static LocalDateTime localDateTime=LocalDateTime.now();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }


    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }
}
