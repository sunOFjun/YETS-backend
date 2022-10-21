package com.sj.yets.repository;

import java.util.List;

import com.sj.yets.api.model.BasicInfoDTO;
import com.sj.yets.api.model.HumanDeductionDTO;
import com.sj.yets.api.model.YetsResultDTO;
import org.apache.ibatis.annotations.Param;

import com.sj.yets.repository.entity.BasicInfoEntity;

public interface BasicInfoRepository {
	List<BasicInfoEntity> getBasicInfo();
	
	List<BasicInfoEntity> getBasicInfoByParam(@Param("name") String name, @Param("jumin") String jumin);

	List<BasicInfoEntity> getTaxRateInfo(@Param("code") String code);

	void insertBasicInfo(@Param("basicInfoDTO") BasicInfoDTO basicInfoDTO);

	void deleteBasicInfo(@Param("basicInfoDTO") BasicInfoDTO basicInfoDTO);

	void updateBasicInfo(@Param("jumin") String jumin, @Param("basicInfoDTO") BasicInfoDTO basicInfoDTO);

}