package com.demo.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.demo.sys.entity.Dept;
import com.demo.sys.mapper.DeptMapper;
import com.demo.sys.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;


@Service
@Transactional
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

    @Override
    public Dept getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public boolean update(Dept entity, Wrapper<Dept> updateWrapper){
        return super.update(entity,updateWrapper);
    }

    @Override
    public boolean updateById(Dept entity){
        return super.updateById(entity);
    }

    @Override
    public boolean removeById(Serializable id){
        return super.removeById(id);
    }

    @Override
    public boolean save(Dept entity) {
        return super.save(entity);
    }


}
