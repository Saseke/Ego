package com.yoke.ego.service;

import com.yoke.ego.common.mapper.UserMapper;
import com.yoke.ego.common.pojo.User;
import com.yoke.ego.common.pojo.UserExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/19
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, UserExample> implements UserService {
    @Autowired
    private UserMapper userMapper;
}
