package com.example.system.service.impl;

import com.example.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.example.system.mapper.MenuMapper;
import com.example.system.domain.Menu;
import com.example.system.service.MenuService;

@Service
public class MenuServiceImpl extends BaseServiceImpl<MenuMapper, Menu> implements MenuService {

}
