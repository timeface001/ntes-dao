package com.fs.dreams.mapper;

import com.fs.dreams.Artist;

public interface ArtistMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Artist record);

    int insertSelective(Artist record);

    Artist selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Artist record);

    int updateByPrimaryKey(Artist record);
}