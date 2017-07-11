package com.fs.dreams.mapper;

import com.fs.dreams.Song;

public interface SongMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Song record);

    int insertSelective(Song record);

    Song selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKeyWithBLOBs(Song record);

    int updateByPrimaryKey(Song record);
}