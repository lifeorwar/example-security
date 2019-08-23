package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.domain.User;
import com.example.system.mapper.UserMapper;
import com.example.system.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}
