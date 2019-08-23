package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.domain.UserConnection;
import com.example.system.mapper.UserConnectionMapper;
import com.example.system.service.UserConnectionService;

@Service
public class UserConnectionServiceImpl extends BaseServiceImpl<UserConnectionMapper, UserConnection> implements UserConnectionService {

}
