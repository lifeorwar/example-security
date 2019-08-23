package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.domain.UserRole;
import com.example.system.mapper.UserRoleMapper;
import com.example.system.service.UserRoleService;

@Service
public class UserRoleServiceImpl extends BaseServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
