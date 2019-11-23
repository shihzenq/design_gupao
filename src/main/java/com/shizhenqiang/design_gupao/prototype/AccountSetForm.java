package com.shizhenqiang.design_gupao.prototype;


import lombok.Data;

import java.util.Date;

@Data
public class AccountSetForm {

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

    /**
     * 会计期间标准化
     */
    public Integer getStartPeriodFormatInt() {
        if (startPeriod != null) {
            String year = startPeriod.substring(0, 4);
            String month = startPeriod.substring(4);
            int monthInt = Integer.parseInt(month);
            if (monthInt > 12 || monthInt < 1) {
                month = "01";
            } else if (monthInt < 10) {
                month = "0" + monthInt;
            } else {
                month = monthInt + "";
            }
            return Integer.parseInt(year + month);
        }
        return null;
    }

    @Override
    public String toString() {
        return "AccountSetForm源数据{" +
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
