package com.demo.bus.vo;

import com.demo.bus.entity.Goods;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsVo extends Goods {

    private Integer page=1;
    private Integer limit=10;

}
