package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 配置spring与Junit的整合
 *
 *
 * zhangfan 1
 * zhangfan 2
 * zhangfan 3
 * zhangfan 4
 * zhangfan 5
 *
 */
/**
 * test1
 */

/**
 * master 1
 *
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class SeckillDaoTest {

    @Resource
    private SeckillDao seckillDao;

    @Test
    public void testQueryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void testReduceNumber() {
        long seckillId = 1000;
        Date date = new Date();
        int updatecount  = seckillDao.reduceNumber(seckillId,date);
        System.out.println(updatecount);
    }

    @Test
    public void queryAll() {
        List<Seckill> seckills = seckillDao.queryAll(0, 2);
        for (Seckill seckill : seckills) {
            System.out.println(seckill);
        }
    }
}


