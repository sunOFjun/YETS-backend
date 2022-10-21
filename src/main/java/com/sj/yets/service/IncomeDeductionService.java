package com.sj.yets.service;

import java.util.List;

import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.service.vo.IncomeDeductionVO;
import com.sj.yets.service.vo.YetsResultVO;

public interface IncomeDeductionService {

	List<IncomeDeductionVO> getIncomeDeduction(String jumin);

	List<YetsResultVO> getIncomeDeductionAmount(String jumin);

	List<YetsResultVO> getIncomeDeductionLimit(String jumin);
	
	IncomeDeductionVO insertIncomeDeduction(String jumin, IncomeDeductionDTO humanDeductionDTO);
	
	IncomeDeductionVO deleteIncomeDeduction(String jumin);
	
}
