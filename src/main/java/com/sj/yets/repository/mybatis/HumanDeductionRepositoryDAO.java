package com.sj.yets.repository.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sj.yets.api.model.HumanDeductionDTO;
import com.sj.yets.repository.HumanDeductionRepository;
import com.sj.yets.repository.entity.HumanDeductionEntity;

@Mapper
public interface HumanDeductionRepositoryDAO  extends HumanDeductionRepository{
	
	public List<HumanDeductionEntity> getHumanDeductionByParam(@Param("jumin") String jumin);
	
	public void insertHumanDeduction(@Param("jumin") String jumin, @Param("humanDeductionDTO") HumanDeductionDTO humanDeductionDTO);
	
	public void deleteHumanDeduction(@Param("jumin") String jumin);
}
