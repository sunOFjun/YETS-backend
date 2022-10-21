package com.sj.yets.repository.mybatis;

import java.util.List;

import com.sj.yets.api.model.BasicInfoDTO;
import com.sj.yets.api.model.YetsResultDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sj.yets.repository.BasicInfoRepository;
import com.sj.yets.repository.entity.BasicInfoEntity;

@Mapper
public interface BasicInfoRepositoryDAO  extends BasicInfoRepository{
	
	List<BasicInfoEntity> getBasicInfo();
	
	List<BasicInfoEntity> getBasicInfoByParam(@Param("jumin") String jumin);

	List<BasicInfoEntity> getTaxRateInfo(@Param("code") String code);

	void insertBasicInfo(@Param("basicInfoDTO") BasicInfoDTO basicInfoDTO);

	void deleteBasicInfo(@Param("basicInfoDTO") BasicInfoDTO basicInfoDTO);

	void updateBasicInfo(@Param("jumin") String jumin, @Param("basicInfoDTO") BasicInfoDTO basicInfoDTO);


}
