package com.sj.yets.service;

import java.util.ArrayList;
import java.util.List;

import com.sj.yets.repository.entity.YetsResultEntity;
import com.sj.yets.service.vo.YetsResultVO;
import org.springframework.stereotype.Service;

import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.repository.entity.IncomeDeductionEntity;
import com.sj.yets.repository.mybatis.IncomeDeductionRepositoryDAO;
import com.sj.yets.service.vo.IncomeDeductionVO;

@Service
public class IncomeDeductionServiceImpl implements IncomeDeductionService{

	private final IncomeDeductionRepositoryDAO incomeDeductionDAO;
	private final VOMapper voMapper;
	
	public IncomeDeductionServiceImpl(IncomeDeductionRepositoryDAO IncomeDeductionDAO, VOMapper voMapper) {
        this.incomeDeductionDAO = IncomeDeductionDAO;
        this.voMapper = voMapper;
    }

	@Override
	public List<IncomeDeductionVO> getIncomeDeduction(String jumin) {
		List<IncomeDeductionVO> result = new ArrayList<>();

		for(IncomeDeductionEntity incomeDeductionEntity : incomeDeductionDAO.getIncomeDeduction(jumin)) {
			result.add(voMapper.toIncomeDeductionVO(incomeDeductionEntity));
			System.out.println("getIncomeDeduction : " + result.get(0));
		}
		
		return result;
	}

	@Override
	public List<YetsResultVO> getIncomeDeductionAmount(String jumin) {
		List<YetsResultVO> result = new ArrayList<>();

		for(YetsResultEntity yetsResultEntity : incomeDeductionDAO.getIncomeDeductionAmount(jumin)) {
			result.add(voMapper.toYetsResultVO(yetsResultEntity));
			System.out.println("getIncomeDeductionAmount : " + result.get(0).getBasicHumanDeductionAmount());
		}

		return result;
	}

	@Override
	public List<YetsResultVO> getIncomeDeductionLimit(String jumin) {
		List<YetsResultVO> result = new ArrayList<>();

		for(YetsResultEntity yetsResultEntity : incomeDeductionDAO.getIncomeDeductionLimit(jumin)) {
			result.add(voMapper.toYetsResultVO(yetsResultEntity));
			System.out.println("getIncomeDeductionLimit : " + result.get(0));
		}

		return result;
	}

	@Override
	public IncomeDeductionVO insertIncomeDeduction(String jumin, IncomeDeductionDTO incomeDeductionDTO) {
		// TODO Auto-generated method stub
		incomeDeductionDAO.deleteIncomeDeduction(jumin);
		System.out.println("deleted");
		System.out.println("before insert: " + jumin);
		incomeDeductionDAO.insertIncomeDeduction(jumin, incomeDeductionDTO);
		
		return null;
	}

	@Override
	public IncomeDeductionVO deleteIncomeDeduction(String jumin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	



}
