package org.seckill.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SuccessKilled {
    private long seckillId;
    private long userPhone;
    private short state;
    private Date createTime;

    //变通，多对一 。一个秒杀seckill实体对应多个记录,这样变通方便后面的存取。
    private Seckill seckill;
}
