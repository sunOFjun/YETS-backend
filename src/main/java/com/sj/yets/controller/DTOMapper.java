package com.sj.yets.controller;

import com.sj.yets.api.model.*;
import com.sj.yets.service.vo.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DTOMapper {
	
	BasicInfoDTO toBasicInfoDTO(BasicInfoVO basicInfo);
	
	HumanDeductionDTO toHumanDeductionDTO(HumanDeductionVO humanDeduction);

	IncomeDeductionDTO toIncomeDeductionDTO(IncomeDeductionVO incomeDeduction);

	YetsResultDTO toYetsResultDTO(YetsResultVO yetsResultVO);
	
	TaxCreditDTO toTaxCreditDTO(TaxCreditVO taxCredit);

}
