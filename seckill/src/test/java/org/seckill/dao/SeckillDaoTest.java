package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

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
    public void queryAll() {
    }

    @Test
    public void reduceNumber() {
    }

}


/*
Caused by: org.springframework.beans.factory.BeanCreationException:
Error creating bean with name 'sqlSessionFactory'
defined in class path resource [spring/spring-dao.xml]:
Invocation of init method failed; nested exception is org.
springframework.core.NestedIOException: Failed to parse mapping resource:
'file [C:\Users\hp-pc\seckill\target\classes\mapper\SeckillDao.xml]';
 nested exception is org.apache.ibatis.builder.BuilderException:
 Error parsing Mapper XML. Cause: org.apache.ibatis.builder.
 BuilderException: Error resolving class. Cause: org.apache.ibatis.type.
 TypeException: Could not resolve type alias 'Seckill'.
 Cause: java.lang.ClassNotFoundException: Cannot find class: Seckill



 */