package com.sj.yets.service.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BasicInfoVO {
    private String name;

    private String  jumin;

    private int totalIncome;

    private int paidTax;

    private int labourIncome;

    private int taxBase;

    private int calculatedTax;

    private int determinedTax;

    private int taxPayable;

    private String code;

    private String codeName;

    private int leftLimit;

    private int rightLimit;

    private BigDecimal sectionRate;

    private BigDecimal rate;

    private int baseAmount;

    private int priority;

}
