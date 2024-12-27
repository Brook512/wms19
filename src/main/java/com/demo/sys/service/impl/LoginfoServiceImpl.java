package com.demo.sys.service.impl;

import com.demo.sys.entity.Loginfo;
import com.demo.sys.mapper.LoginfoMapper;
import com.demo.sys.service.ILoginfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements ILoginfoService {

}
