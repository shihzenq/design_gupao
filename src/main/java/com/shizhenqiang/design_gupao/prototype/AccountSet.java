package com.shizhenqiang.design_gupao.prototype;

import lombok.Data;

import java.util.Date;

@Data
public class AccountSet {
    private Long id;

    private Long customerId;

    private Long industryId;

    private Short taxNature;

    private String codeLevel;

    private String startPeriod;

    private Long accountingStandardId;

    private Boolean enableAudit = false;

    private Long createUserId;

    private Date createTime;

    @Override
    public String toString() {
        return "AccountSet_copy后{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", industryId=" + industryId +
                ", taxNature=" + taxNature +
                ", codeLevel='" + codeLevel + '\'' +
                ", startPeriod='" + startPeriod + '\'' +
                ", accountingStandardId=" + accountingStandardId +
                ", enableAudit=" + enableAudit +
                ", createUserId=" + createUserId +
                ", createTime=" + createTime +
                '}';
    }
}
