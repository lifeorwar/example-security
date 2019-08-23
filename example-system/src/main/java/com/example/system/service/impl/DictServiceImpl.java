package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.mapper.DictMapper;
import com.example.system.domain.Dict;
import com.example.system.service.DictService;

@Service
public class DictServiceImpl extends BaseServiceImpl<DictMapper, Dict> implements DictService {

}
