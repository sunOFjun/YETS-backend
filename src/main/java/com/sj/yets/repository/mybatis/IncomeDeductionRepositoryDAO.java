package com.sj.yets.repository.mybatis;

import java.util.List;

import com.sj.yets.api.model.YetsResultDTO;
import com.sj.yets.repository.entity.YetsResultEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.repository.IncomeDeductionRepository;
import com.sj.yets.repository.entity.IncomeDeductionEntity;

@Mapper
public interface IncomeDeductionRepositoryDAO  extends IncomeDeductionRepository{

	List<IncomeDeductionEntity> getIncomeDeduction(@Param("jumin") String jumin);

	List<YetsResultEntity> getIncomeDeductionAmount(@Param("jumin") String jumin);

	List<YetsResultEntity> getIncomeDeductionLimit(@Param("jumin") String jumin);
	
	void insertIncomeDeduction(@Param("jumin") String jumin, @Param("incomeDeductionDTO") IncomeDeductionDTO incomeDeductionDTO);
	
	void deleteIncomeDeduction(@Param("jumin") String jumin);

	void insertIncomeDeductionAmount(@Param("jumin") String jumin, @Param("yetsResultDTO") YetsResultDTO yetsResultDTO);

	void deleteIncomeDeductionAmount(@Param("jumin") String jumin);

	void insertIncomeDeductionLimit(@Param("jumin") String jumin, @Param("yetsResultDTO") YetsResultDTO yetsResultDTO);

	void deleteIncomeDeductionLimit(@Param("jumin") String jumin);
}
