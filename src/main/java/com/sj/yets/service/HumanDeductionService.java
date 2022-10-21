package com.sj.yets.service;

import java.util.List;

import com.sj.yets.api.model.HumanDeductionDTO;
import com.sj.yets.service.vo.HumanDeductionVO;

public interface HumanDeductionService {
	
	List<HumanDeductionVO> getHumanDeductionByParam(String jumin);
	
	HumanDeductionVO insertHumanDeduction(String jumin, HumanDeductionDTO humanDeductionDTO);
	
	HumanDeductionVO deleteHumanDeduction(String jumin);
	
}
