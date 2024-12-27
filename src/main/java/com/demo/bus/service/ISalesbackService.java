package com.demo.bus.service;

import com.demo.bus.entity.Salesback;
import com.baomidou.mybatisplus.extension.service.IService;


public interface ISalesbackService extends IService<Salesback> {

    /**
     * 对商品销售进行退货处理
     * @param id    销售单ID
     * @param number    退货数量
     * @param remark    备注
     */
    void addSalesback(Integer id, Integer number, String remark);

}
