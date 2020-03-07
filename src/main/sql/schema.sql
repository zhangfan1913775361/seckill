--数据库初始化脚本
--创建数据库
CREATE DATEBASE seckill;
--使用数据库
use seckill;

--创建秒杀库存表
CREATE TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar (120) not null comment '商品名称',
`number` int not null comment'库存数量',
`start_time` timestamp not null comment '秒杀开始时间',
`end_time` timestamp not null comment '秒杀结束时间',
`create_time` timestamp not null default current_timestamp comment '创建时间'
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

--初始化数据
insert into
  seckill(name,number,start_time,end_time)
value
  ('1块钱秒杀PDD offer',100,'2020-03-07 00:00:00','2020-03-08 00:00:00'),
  ('中兴送offer',200,'2020-03-07 00:00:00','2020-03-08 00:00:00'),
  ('华为劝退offer',300,'2020-03-07 00:00:00','2020-03-08 00:00:00'),
  ('国企offer',400,'2020-03-07 00:00:00','2020-03-08 00:00:00');

--秒杀成功明细表
--用户登录认证相关信息

create table success_killed(
`seckill_id` bigint not null comment'秒杀商品id',
`user_phone` bigint not null comment'用户手机号',
`state` tinyint not null default -1 comment '状态标识：-1:无效 0:成功 1:已付款 2:已发货',
`create_time` timestamp not null   comment '创建时间',
PRIMARY KEY (seckill_id,user_phone),/*联合主键*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表'

--链接数据库控制台
mysql -uroot -p


--为什么手写ddl呢?
--记录每次上线的DDL的修改
--上线v1.1
ALTER TABLE seckill;
DROP INDEX idx_create_time;

--上线v1.1