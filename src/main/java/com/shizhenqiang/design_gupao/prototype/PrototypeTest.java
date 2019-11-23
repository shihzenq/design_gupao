package com.shizhenqiang.design_gupao.prototype;

import org.springframework.beans.BeanUtils;

import java.util.Date;

public class PrototypeTest {

    public static void main(String[] args) {
        AccountSetForm accountSetForm = new AccountSetForm();
        accountSetForm.setId(1L);
        accountSetForm.setAccountingStandardId(1L);
        accountSetForm.setCodeLevel("2");
        accountSetForm.setCreateUserId(1L);
        accountSetForm.setCreateTime(new Date());
        accountSetForm.setCustomerId(2L);
        accountSetForm.setEnableAudit(false);
        accountSetForm.setIndustryId(3L);
        accountSetForm.setStartPeriod("201908");
        accountSetForm.setTaxNature((short)2);
        System.out.println(accountSetForm);
        // 通过原型模式，实现浅copy
        AccountSet accountSet = new AccountSet();
        BeanUtils.copyProperties(accountSetForm, accountSet);

        System.out.println(accountSet);
    }
}
