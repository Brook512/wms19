package com.demo.bus.service;

import com.demo.bus.entity.Provider;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IProviderService extends IService<Provider> {

    /**
     * 根据供应商ID删除供应商
     * @param id
     */
    void deleteProviderById(Integer id);
}
