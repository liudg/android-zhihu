package com.liudong.zhihu.model;

import java.util.List;

/**
 * Created by liudong on 2015/8/14.
 */
public class News {

    private List<StoriesEntity> stories;
    private int color;
    private String description;
    private String name;
    private String background;
    private String image;
    private List<EditorsEntity> editors;
    private String image_source;

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setEditors(List<EditorsEntity> editors) {
        this.editors = editors;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public int getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getBackground() {
        return background;
    }

    public String getImage() {
        return image;
    }

    public List<EditorsEntity> getEditors() {
        return editors;
    }

    public String getImage_source() {
        return image_source;
    }


    public static class EditorsEntity {

        private int id;
        private String bio;
        private String name;
        private String avatar;
        private String url;

        public void setId(int id) {
            this.id = id;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getId() {
            return id;
        }

        public String getBio() {
            return bio;
        }

        public String getName() {
            return name;
        }

        public String getAvatar() {
            return avatar;
        }

        public String getUrl() {
            return url;
        }
    }
}
