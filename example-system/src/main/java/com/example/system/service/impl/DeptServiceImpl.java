package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.mapper.DeptMapper;
import com.example.system.domain.Dept;
import com.example.system.service.DeptService;

@Service
public class DeptServiceImpl extends BaseServiceImpl<DeptMapper, Dept> implements DeptService {

}
