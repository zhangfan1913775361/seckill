package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    private long seckillid;
    private long userphone;
    private short state;
    private Date createtime;

    //变通 多对一
    private Seckill seckill;

    public long getSeckillid() {
        return seckillid;
    }

    public void setSeckillid(long seckillid) {
        this.seckillid = seckillid;
    }

    public long getUserphone() {
        return userphone;
    }

    public void setUserphone(long userphone) {
        this.userphone = userphone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillid=" + seckillid +
                ", userphone=" + userphone +
                ", state=" + state +
                ", createtime=" + createtime +
                '}';
    }
}
