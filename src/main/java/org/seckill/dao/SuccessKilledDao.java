package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
    /**
     * 插入购买明细，可以过滤重复（下面这两个是联合主键）
     *
     * @param seckillId
     * @param userPhone
     * @return 返回值表示插入的行数，如果返回值>0，表示插入失败了
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     *
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);


}
