package com.fs.dreams.mapper;

import com.fs.dreams.SongComment;

public interface SongCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SongComment record);

    int insertSelective(SongComment record);

    SongComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SongComment record);

    int updateByPrimaryKeyWithBLOBs(SongComment record);

    int updateByPrimaryKey(SongComment record);
}