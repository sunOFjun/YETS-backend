package com.sj.yets.service.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HumanDeductionVO {
    private String  jumin;

    private Integer myself;

    private String spouseYn;

    private Integer parents;

    private Integer children;

    private Integer exceptChildren; 
    
    private Integer sibling; 
    
    private Integer seniority;

    private Integer disabled;
    
    private Integer women; 

}
