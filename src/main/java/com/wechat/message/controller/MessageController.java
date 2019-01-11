/**
 * FileName:MessageController
 * Author:leeyf
 * Date:19-1-11 上午8:55
 * Description:微信自动回复
 */
package com.wechat.message.controller;

import com.wechat.message.entity.Message;
import com.wechat.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    /**
     * findAll()
     * @param command
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Message> selectCommand(String command) {
        return  messageService.findAll();
    }
}
