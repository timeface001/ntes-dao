package com.fs.dreams;

public class SongArtistRelationKey {
    private Long songSrcId;

    private Long artistSrcId;

    public Long getSongSrcId() {
        return songSrcId;
    }

    public void setSongSrcId(Long songSrcId) {
        this.songSrcId = songSrcId;
    }

    public Long getArtistSrcId() {
        return artistSrcId;
    }

    public void setArtistSrcId(Long artistSrcId) {
        this.artistSrcId = artistSrcId;
    }
}