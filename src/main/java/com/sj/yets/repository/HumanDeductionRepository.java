package com.sj.yets.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sj.yets.repository.entity.HumanDeductionEntity;
import com.sj.yets.api.model.HumanDeductionDTO;

public interface HumanDeductionRepository {
	
	List<HumanDeductionEntity> getHumanDeductionByParam(@Param("jumin") String jumin);
	
	void insertHumanDeduction(@Param("jumin") String jumin, @Param("humanDeductionDTO") HumanDeductionDTO humanDeductionDTO);
	
	void deleteHumanDeduction(@Param("jumin") String jumin);
}
