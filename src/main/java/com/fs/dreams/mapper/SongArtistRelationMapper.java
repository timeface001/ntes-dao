package com.fs.dreams.mapper;

import com.fs.dreams.SongArtistRelationKey;

public interface SongArtistRelationMapper {
    int deleteByPrimaryKey(SongArtistRelationKey key);

    int insert(SongArtistRelationKey record);

    int insertSelective(SongArtistRelationKey record);
}