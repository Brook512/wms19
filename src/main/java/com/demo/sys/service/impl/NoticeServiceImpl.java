package com.demo.sys.service.impl;

import com.demo.sys.entity.Notice;
import com.demo.sys.mapper.NoticeMapper;
import com.demo.sys.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
