package com.sj.yets.service;

import java.util.List;

import com.sj.yets.api.model.BasicInfoDTO;
import com.sj.yets.service.vo.BasicInfoVO;

public interface BasicInfoService {
	
	List<BasicInfoVO> getBasicInfo();

	void insertBasicInfo(BasicInfoDTO basicInfoDTO);

	void deleteBasicInfo(BasicInfoDTO basicInfoDTO);
	
	List<BasicInfoVO> getBasicInfoByParam(String name, String jumin);

	void calculateYets(String name, String jumin);
}
