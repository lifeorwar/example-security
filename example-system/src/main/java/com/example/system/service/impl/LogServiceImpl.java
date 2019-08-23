package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.mapper.LogMapper;
import com.example.system.domain.Log;
import com.example.system.service.LogService;

@Service
public class LogServiceImpl extends BaseServiceImpl<LogMapper, Log> implements LogService {

}
