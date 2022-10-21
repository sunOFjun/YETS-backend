package com.sj.yets.service;

import java.util.ArrayList;
import java.util.List;

import com.sj.yets.api.model.TaxCreditDTO;
import com.sj.yets.repository.entity.TaxCreditEntity;
import com.sj.yets.repository.entity.YetsResultEntity;
import com.sj.yets.repository.mybatis.TaxCreditRepositoryDAO;
import com.sj.yets.service.vo.TaxCreditVO;
import com.sj.yets.service.vo.YetsResultVO;
import org.springframework.stereotype.Service;

@Service
public class TaxCreditServiceImpl implements TaxCreditService{

	private final TaxCreditRepositoryDAO taxCreditDAO;
	private final VOMapper voMapper;

	public TaxCreditServiceImpl(TaxCreditRepositoryDAO taxCreditDAO, VOMapper voMapper) {
		this.taxCreditDAO = taxCreditDAO;
		this.voMapper = voMapper;
	}



	@Override
	public List<TaxCreditVO> getTaxCredit(String jumin) {
		List<TaxCreditVO> result = new ArrayList<>();

		for(TaxCreditEntity taxCreditEntity : taxCreditDAO.getTaxCredit(jumin)) {
			result.add(voMapper.toTaxCreditVO(taxCreditEntity));
			System.out.println("getTaxCredit : " + result.get(0));
		}

		return result;
	}

	@Override
	public List<YetsResultVO> getTaxCreditAmount(String jumin) {
		List<YetsResultVO> result = new ArrayList<>();

		for(YetsResultEntity yetsResultEntity : taxCreditDAO.getTaxCreditAmount(jumin)) {
			result.add(voMapper.toYetsResultVO(yetsResultEntity));
			System.out.println("getTaxCreditAmount : " + result.get(0).getLabourIncomeTaxCreditAmount());
		}

		return result;
	}

	@Override
	public List<YetsResultVO> getTaxCreditLimit(String jumin) {
		List<YetsResultVO> result = new ArrayList<>();

		for(YetsResultEntity yetsResultEntity : taxCreditDAO.getTaxCreditLimit(jumin)) {
			result.add(voMapper.toYetsResultVO(yetsResultEntity));
			System.out.println("getTaxCreditLimit : " + result.get(0));
		}

		return result;
	}

	@Override
	public TaxCreditVO insertTaxCredit(String jumin, TaxCreditDTO taxCreditDTO) {
		taxCreditDAO.deleteTaxCredit(jumin);
		taxCreditDAO.insertTaxCredit(jumin, taxCreditDTO);
		return null;
	}

	@Override
	public TaxCreditVO deleteTaxCredit(String jumin) {
		// TODO Auto-generated method stub
		return null;
	}

}
