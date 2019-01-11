package com.wechat.message.mapper;

import com.wechat.message.entity.Message;

import java.util.List;

/**
 * @author leeyf
 * @date 19/1/11
 */
public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> selectAll();
}