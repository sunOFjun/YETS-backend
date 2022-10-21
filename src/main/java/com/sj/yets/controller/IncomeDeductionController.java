package com.sj.yets.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.sj.yets.api.model.YetsResultDTO;
import com.sj.yets.service.vo.YetsResultVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.sj.yets.api.IncomeDeductionApi;
import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.service.IncomeDeductionService;
import com.sj.yets.service.vo.IncomeDeductionVO;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "incomeDeduction")
public class IncomeDeductionController implements IncomeDeductionApi {

	private final IncomeDeductionService incomeDeductionService;
	
	private final DTOMapper dtoMapper;
	
	public IncomeDeductionController(IncomeDeductionService incomeDeductionService, DTOMapper dtoMapper ) {
		
		this.incomeDeductionService = incomeDeductionService;
		this.dtoMapper = dtoMapper;
	}

	@Override
	public ResponseEntity<List<IncomeDeductionDTO>> getIncomeDeduction(String jumin) {
		
		List<IncomeDeductionDTO> result = new ArrayList<>();
		
		for(IncomeDeductionVO incomeDeductionVo : incomeDeductionService.getIncomeDeduction(jumin)) {
			System.out.println("controller : " + incomeDeductionVo.getJumin());
			result.add(dtoMapper.toIncomeDeductionDTO(incomeDeductionVo));
			System.out.println("controller : " + dtoMapper.toIncomeDeductionDTO(incomeDeductionVo).getJumin());
		}
		
		
		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<YetsResultDTO>> getIncomeDeductionAmount(String jumin) {
		List<YetsResultDTO> result = new ArrayList<>();

		for(YetsResultVO yetsResultVO : incomeDeductionService.getIncomeDeductionAmount(jumin)) {
			System.out.println("controller : " + yetsResultVO.getJumin());
			result.add(dtoMapper.toYetsResultDTO(yetsResultVO));
			System.out.println("controller : " + dtoMapper.toYetsResultDTO(yetsResultVO).getJumin());
		}

		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<YetsResultDTO>> getIncomeDeductionLimit(String jumin) {
		List<YetsResultDTO> result = new ArrayList<>();

		for(YetsResultVO yetsResultVO : incomeDeductionService.getIncomeDeductionLimit(jumin)) {
			System.out.println("controller : " + yetsResultVO.getJumin());
			result.add(dtoMapper.toYetsResultDTO(yetsResultVO));
			System.out.println("controller : " + dtoMapper.toYetsResultDTO(yetsResultVO).getJumin());
		}

		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<IncomeDeductionDTO>> insertIncomeDeduction(String jumin,
			@Valid List<IncomeDeductionDTO> incomeDeductionDTO) {
		List<IncomeDeductionDTO> result = new ArrayList<>();
		incomeDeductionService.insertIncomeDeduction(jumin, incomeDeductionDTO.get(0));
		System.out.println("controller : " + jumin);
		return ResponseEntity.ok().body(result);
	}
	
	
}
