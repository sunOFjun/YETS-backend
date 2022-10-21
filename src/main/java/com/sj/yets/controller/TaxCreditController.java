package com.sj.yets.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.api.model.YetsResultDTO;
import com.sj.yets.service.IncomeDeductionService;
import com.sj.yets.service.TaxCreditService;
import com.sj.yets.service.vo.IncomeDeductionVO;
import com.sj.yets.service.vo.TaxCreditVO;
import com.sj.yets.service.vo.YetsResultVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.sj.yets.api.TaxCreditApi;
import com.sj.yets.api.model.TaxCreditDTO;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "taxCredit")
public class TaxCreditController implements TaxCreditApi{

	private final TaxCreditService taxCreditService;

	private final DTOMapper dtoMapper;

	public TaxCreditController(TaxCreditService taxCreditService, DTOMapper dtoMapper ) {

		this.taxCreditService = taxCreditService;
		this.dtoMapper = dtoMapper;
	}

	@Override
	public ResponseEntity<List<TaxCreditDTO>> getTaxCredit(String jumin) {
		List<TaxCreditDTO> result = new ArrayList<>();

		for(TaxCreditVO taxCreditVo : taxCreditService.getTaxCredit(jumin)) {
			result.add(dtoMapper.toTaxCreditDTO(taxCreditVo));
			System.out.println("getTaxCredit : " + taxCreditVo);
		}

		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<YetsResultDTO>> getTaxCreditAmount(String jumin) {
		List<YetsResultDTO> result = new ArrayList<>();

		for(YetsResultVO yetsResultVO : taxCreditService.getTaxCreditAmount(jumin)) {
			result.add(dtoMapper.toYetsResultDTO(yetsResultVO));
			System.out.println("getTaxCreditAmount : " + yetsResultVO.getLabourIncomeTaxCreditAmount());
		}

		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<YetsResultDTO>> getTaxCreditLimit(String jumin) {
		List<YetsResultDTO> result = new ArrayList<>();

		for(YetsResultVO yetsResultVO : taxCreditService.getTaxCreditLimit(jumin)) {
			result.add(dtoMapper.toYetsResultDTO(yetsResultVO));
			System.out.println("getTaxCreditLimit : " + yetsResultVO);
		}

		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<TaxCreditDTO>> insertTaxCredit(String jumin, @Valid List<TaxCreditDTO> taxCreditDTO) {
		List<TaxCreditDTO> result = new ArrayList<>();
		taxCreditService.insertTaxCredit(jumin, taxCreditDTO.get(0));
		return ResponseEntity.ok().body(result);
	}


}
