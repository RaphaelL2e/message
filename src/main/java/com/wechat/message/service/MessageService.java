/**
 * FileName:MessageService
 * Author:leeyf
 * Date:19-1-11 上午8:58
 * Description:
 */
package com.wechat.message.service;

import com.wechat.message.entity.Message;

import java.util.List;

public interface MessageService {
    public List<Message> findAll();
}
