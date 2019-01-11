/**
 * FileName:MessageServiceImpl
 * Author:leeyf
 * Date:19-1-11 上午8:59
 * Description:
 */
package com.wechat.message.service.Impl;

import com.wechat.message.entity.Message;
import com.wechat.message.mapper.MessageMapper;
import com.wechat.message.service.MessageService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "messageService")
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    @Override
    public List<Message> findAll() {
        return messageMapper.selectAll();
    }
}
