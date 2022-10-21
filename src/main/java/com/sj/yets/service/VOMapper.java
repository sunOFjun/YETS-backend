package com.sj.yets.service;

import org.mapstruct.Mapper;

import com.sj.yets.repository.entity.*;
import com.sj.yets.service.vo.*;

@Mapper(componentModel="spring")
public interface VOMapper {
	BasicInfoVO toBasicInfoVO(BasicInfoEntity entity);

	HumanDeductionVO toHumanDeductionVO(HumanDeductionEntity entity);

	IncomeDeductionVO toIncomeDeductionVO(IncomeDeductionEntity entity);

	YetsResultVO toYetsResultVO(YetsResultEntity entity);

	TaxCreditVO toTaxCreditVO(TaxCreditEntity entity);
	
}
