package com.demo.bus.vo;

import com.demo.bus.entity.Salesback;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@EqualsAndHashCode(callSuper = false)
public class SalesbackVo extends Salesback {

    private Integer page = 1;

    private Integer limit = 10;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;


}
