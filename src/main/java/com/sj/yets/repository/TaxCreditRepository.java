package com.sj.yets.repository;

import java.util.List;

import com.sj.yets.api.model.TaxCreditDTO;
import com.sj.yets.api.model.YetsResultDTO;
import com.sj.yets.repository.entity.TaxCreditEntity;
import com.sj.yets.repository.entity.YetsResultEntity;
import org.apache.ibatis.annotations.Param;

import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.repository.entity.IncomeDeductionEntity;

public interface TaxCreditRepository {
	List<TaxCreditEntity> getTaxCredit(@Param("jumin") String jumin);

	List<YetsResultEntity> getTaxCreditAmount(@Param("jumin") String jumin);

	List<YetsResultEntity> getTaxCreditLimit(@Param("jumin") String jumin);
	
	void insertTaxCredit(@Param("jumin") String jumin, @Param("taxCreditDTO") TaxCreditDTO taxCreditDTO);
	
	void deleteTaxCredit(@Param("jumin") String jumin);

	void insertTaxCreditAmount(@Param("jumin") String jumin, @Param("yetsResultDTO") YetsResultDTO yetsResultDTO);

	void deleteTaxCreditAmount(@Param("jumin") String jumin);

	void insertTaxCreditLimit(@Param("jumin") String jumin, @Param("yetsResultDTO") YetsResultDTO yetsResultDTO);

	void deleteTaxCreditLimit(@Param("jumin") String jumin);
}
