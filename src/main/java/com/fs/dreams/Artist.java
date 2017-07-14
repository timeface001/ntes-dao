package com.fs.dreams;

import java.util.Date;

public class Artist {
    private Long id;

    private Long srcId;

    private String name;

    private String alias;

    private Integer musicSize;

    private Integer albumSize;

    private String avatar;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSrcId() {
        return srcId;
    }

    public void setSrcId(Long srcId) {
        this.srcId = srcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Integer getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(Integer musicSize) {
        this.musicSize = musicSize;
    }

    public Integer getAlbumSize() {
        return albumSize;
    }

    public void setAlbumSize(Integer albumSize) {
        this.albumSize = albumSize;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}