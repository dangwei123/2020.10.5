package com.dang.test.service.impl;

import com.dang.test.entity.User;
import com.dang.test.mapper.UserMapper;
import com.dang.test.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dang
 * @since 2020-10-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
