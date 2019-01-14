/**
 * FileName:CodeController
 * Author:leeyf
 * Date:19-1-14 下午4:00
 * Description:
 */
package com.wechat.message.controller;

import com.wechat.message.util.xcode.Captcha;
import com.wechat.message.util.xcode.GifCaptcha;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@RestController
@RequestMapping(value = "")
public class CodeController {
    /**
     * 获取验证码（Gif版本）
     * @param response
     */
    @RequestMapping(value="getGifCode",method= RequestMethod.GET)
    public void getGifCode(HttpServletResponse response, HttpServletRequest request){
        try {
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/gif");
            /**
             * gif格式动画验证码
             * 宽，高，位数。
             */
            Captcha captcha = new GifCaptcha(146,33,4);
            //输出
            captcha.out(response.getOutputStream());
            HttpSession session = request.getSession(true);
            //存入Session
            session.setAttribute("_code",captcha.text().toLowerCase());
        } catch (Exception e) {
            //LoggerUtils.fmtError(getClass(),e, "获取验证码异常：%s",e.getMessage());
        }
    }

    @RequestMapping(value = "/getCode",method = RequestMethod.GET)
    public String getCode(HttpServletRequest request){
        System.out.println((String) request.getSession().getAttribute("_code"));
        return (String) request.getSession().getAttribute("_code");
    }
}
