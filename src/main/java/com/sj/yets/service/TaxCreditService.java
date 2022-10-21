package com.sj.yets.service;

import java.util.List;

import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.api.model.TaxCreditDTO;
import com.sj.yets.service.vo.IncomeDeductionVO;
import com.sj.yets.service.vo.TaxCreditVO;
import com.sj.yets.service.vo.YetsResultVO;

public interface TaxCreditService {
	List<TaxCreditVO> getTaxCredit(String jumin);

	List<YetsResultVO> getTaxCreditAmount(String jumin);

	List<YetsResultVO> getTaxCreditLimit(String jumin);
	
	TaxCreditVO insertTaxCredit(String jumin, TaxCreditDTO taxCreditDTO);
	
	TaxCreditVO deleteTaxCredit(String jumin);
}
