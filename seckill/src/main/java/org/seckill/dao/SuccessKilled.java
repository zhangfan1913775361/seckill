package org.seckill.dao;

public interface SuccessKilled {
    int insertSuccessKilled(long seckilled,long userPhone);

    SuccessKilled queryByIdWithSeckill(long seckillId);
}
