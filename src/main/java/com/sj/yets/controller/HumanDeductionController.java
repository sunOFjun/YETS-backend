package com.sj.yets.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.sj.yets.api.HumanDeductionApi;
import com.sj.yets.api.model.HumanDeductionDTO;
import com.sj.yets.service.HumanDeductionService;
import com.sj.yets.service.vo.HumanDeductionVO;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "humanDeduction")
public class HumanDeductionController implements HumanDeductionApi {

	private final HumanDeductionService humanDeductionService;
	
	private final DTOMapper dtoMapper;
	
	public HumanDeductionController(HumanDeductionService humanDeductionService, DTOMapper dtoMapper ) {
		
		this.humanDeductionService = humanDeductionService;
		this.dtoMapper = dtoMapper;
	}

	@Override
	public ResponseEntity<List<HumanDeductionDTO>> getHumanDeductionByParam(String jumin) {
		
		List<HumanDeductionDTO> result = new ArrayList<>();
		
		for(HumanDeductionVO humanDeductionVo : humanDeductionService.getHumanDeductionByParam(jumin)) {
			System.out.println("controller : " + humanDeductionVo.getJumin());
			result.add(dtoMapper.toHumanDeductionDTO(humanDeductionVo));
			System.out.println("controller : " + dtoMapper.toHumanDeductionDTO(humanDeductionVo).getJumin());
		}
		
		
		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<HumanDeductionDTO>> insertHumanDeduction(String jumin,
			@Valid List<HumanDeductionDTO> humanDeductionDTO) {
		List<HumanDeductionDTO> result = new ArrayList<>();
		humanDeductionService.insertHumanDeduction(jumin, humanDeductionDTO.get(0));
		System.out.println("controller : " + humanDeductionDTO.get(0).getJumin());
		return ResponseEntity.ok().body(result);
	}
	
	
}
