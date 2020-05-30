/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: DemoController
 * Author:   huangcheng
 * Date:     2019/6/1 12:36
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xiaomi.thirdpartplatment.domain.UserInfo;
import xiaomi.thirdpartplatment.service.DemoService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
@Controller
@RequestMapping("/admin")
public class DemoController {


    @RequestMapping("/login")
    public String login(HttpServletRequest request) {

        return "login";
    }

    @RequestMapping("/main")
    public String save(HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        UserInfo userInfo = demoService.queryUser(userName, password);
        if (null != userInfo) {
            return "main";
        }
        return "login";
    }


    @Autowired
    DemoService demoService;

    @RequestMapping("/test")
    @ResponseBody
    public void testDemo() {
        demoService.insert();
    }


}
