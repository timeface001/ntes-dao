package com.fs.dreams;

import java.util.Date;

public class SongComment {
    private Long id;

    private Long songSrcId;

    private Long srcId;

    private Integer count;

    private String userNickname;

    private Long userSrcId;

    private String userAvatar;

    private Long publishTime;

    private Date createTime;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSongSrcId() {
        return songSrcId;
    }

    public void setSongSrcId(Long songSrcId) {
        this.songSrcId = songSrcId;
    }

    public Long getSrcId() {
        return srcId;
    }

    public void setSrcId(Long srcId) {
        this.srcId = srcId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Long getUserSrcId() {
        return userSrcId;
    }

    public void setUserSrcId(Long userSrcId) {
        this.userSrcId = userSrcId;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}