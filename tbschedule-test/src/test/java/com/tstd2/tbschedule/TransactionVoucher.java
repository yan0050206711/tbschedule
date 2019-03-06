package com.tstd2.tbschedule;

public class TransactionVoucher {
    /**
     * 凭证唯一编码
     */
    private Long id;
    /**
     * 交易方向（0：收入  1：支出）
     */
    private Integer direction;
    /**
     * 交易金额（单位：分）
     */
    private Long admount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Long getAdmount() {
        return admount;
    }

    public void setAdmount(Long admount) {
        this.admount = admount;
    }

    @Override
    public String toString() {
        return "TransactionVoucher{" +
                "id=" + id +
                ", direction=" + direction +
                ", admount=" + admount +
                '}';
    }
}
