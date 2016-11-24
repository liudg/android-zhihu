package com.liudong.zhihu.model;

import java.util.List;

/**
 * Created by liudong on 2015/8/17.
 */
public class Content {

    private int id;
    private List<RecommendersEntity> recommenders;
    private String body;
    private String title;
    private String ga_prefix;
    private String share_url;
    private String image;
    private int type;
    private List<String> css;
    private String image_source;

    public void setId(int id) {
        this.id = id;
    }

    public void setRecommenders(List<RecommendersEntity> recommenders) {
        this.recommenders = recommenders;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }


    public void setImage(String image) {
        this.image = image;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCss(List<String> css) {
        this.css = css;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public int getId() {
        return id;
    }

    public List<RecommendersEntity> getRecommenders() {
        return recommenders;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public String getShare_url() {
        return share_url;
    }


    public String getImage() {
        return image;
    }

    public int getType() {
        return type;
    }

    public List<String> getCss() {
        return css;
    }

    public String getImage_source() {
        return image_source;
    }

    public static class RecommendersEntity {

        private String avatar;

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return avatar;
        }
    }
}
