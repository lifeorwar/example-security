package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.domain.Role;
import com.example.system.mapper.RoleMapper;
import com.example.system.service.RoleService;

@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role> implements RoleService {

}
