package com.yoke.ego.frontweb.web;

import com.yoke.ego.common.pojo.UserExample;
import com.yoke.ego.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yoke on 2018/3/22
 */
@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/demo")
    public String test() {
        UserExample userExample = new UserExample();
        userExample.or().andUserIdEqualTo(1L);
        long count = userService.countByExample(userExample);
        return String.valueOf(count);
    }
}
