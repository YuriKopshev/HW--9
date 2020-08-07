package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }


    public void wallDelete(int ownerId,int postId) {

    }

    public Post[] wallSearch(int ownerId,String domain,String query,int ownersOnly,int count,int offset) {

        return null;
    }


}
