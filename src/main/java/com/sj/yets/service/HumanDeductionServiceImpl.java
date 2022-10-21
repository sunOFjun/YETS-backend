package com.sj.yets.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sj.yets.api.model.HumanDeductionDTO;
import com.sj.yets.repository.entity.HumanDeductionEntity;
import com.sj.yets.repository.mybatis.HumanDeductionRepositoryDAO;
import com.sj.yets.service.vo.HumanDeductionVO;

@Service
public class HumanDeductionServiceImpl implements HumanDeductionService{

	private final HumanDeductionRepositoryDAO humanDeductionDAO;
	private final VOMapper voMapper;
	
	public HumanDeductionServiceImpl(HumanDeductionRepositoryDAO HumanDeductionDAO, VOMapper voMapper) {
        this.humanDeductionDAO = HumanDeductionDAO;
        this.voMapper = voMapper;
    }

	@Override
	public List<HumanDeductionVO> getHumanDeductionByParam(String jumin) {
		List<HumanDeductionVO> result = new ArrayList<>();

		for(HumanDeductionEntity HumanDeductionEntity : humanDeductionDAO.getHumanDeductionByParam(jumin)) {
			System.out.println(HumanDeductionEntity.getJumin());
			result.add(voMapper.toHumanDeductionVO(HumanDeductionEntity));
			System.out.println(result.get(0).getJumin());
		}
		
		return result;
	}

	@Override
	public HumanDeductionVO insertHumanDeduction(String jumin, HumanDeductionDTO humanDeductionDTO) {
		// TODO Auto-generated method stub
		System.out.println("insertHD in service: " + humanDeductionDTO.getJumin());
		humanDeductionDAO.deleteHumanDeduction(jumin);
		System.out.println("deleted");
		humanDeductionDAO.insertHumanDeduction(jumin, humanDeductionDTO);
		return null;
	}

	@Override
	public HumanDeductionVO deleteHumanDeduction(String jumin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	



}
