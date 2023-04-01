package com.chenwendy.model;

import java.util.Date;

public class Order {

    private Integer uderId;
    private Integer total_amount;
    private Integer orderId;
    private Date createTime;
    private Date lastModifiedDate;

    public Integer getUderId() {
        return uderId;
    }

    public void setUderId(Integer uderId) {
        this.uderId = uderId;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
