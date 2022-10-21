package com.sj.yets.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.sj.yets.api.model.YetsResultDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.sj.yets.api.BasicInfoApi;
import com.sj.yets.api.model.BasicInfoDTO;
import com.sj.yets.service.BasicInfoService;
import com.sj.yets.service.vo.BasicInfoVO;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "basicInfo")
public class BasicInfoController implements BasicInfoApi {

	private final BasicInfoService basicInfoService;
	
	private final DTOMapper dtoMapper;
	
	public BasicInfoController(BasicInfoService basicInfoService, DTOMapper dtoMapper ) {
		
		this.basicInfoService = basicInfoService;
		this.dtoMapper = dtoMapper;
	}

	@Override
	public ResponseEntity<List<YetsResultDTO>> calculateYets(String name, String jumin) {

		basicInfoService.calculateYets(name, jumin);
		return null;
	}

	@Override
	public ResponseEntity<List<BasicInfoDTO>> getBasicInfo() {
		
		List<BasicInfoDTO> result = new ArrayList<>();
		
		for(BasicInfoVO basicInfoVo : basicInfoService.getBasicInfo()) {
			System.out.println(basicInfoVo.getJumin());
			result.add(dtoMapper.toBasicInfoDTO(basicInfoVo));
			System.out.println(dtoMapper.toBasicInfoDTO(basicInfoVo).getJumin());
		}
		
		
		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<BasicInfoDTO>> insertBasicInfo(@Valid List<BasicInfoDTO> basicInfoDTO) {
		basicInfoService.deleteBasicInfo(basicInfoDTO.get(0));
		basicInfoService.insertBasicInfo(basicInfoDTO.get(0));
		return null;
	}
	@Override
	public ResponseEntity<List<BasicInfoDTO>> getBasicInfoByParam(String name, String jumin) {

		List<BasicInfoDTO> result = new ArrayList<>();
		
		for(BasicInfoVO basicInfoVo : basicInfoService.getBasicInfoByParam(name, jumin)) {
			System.out.println(basicInfoVo.getJumin());
			result.add(dtoMapper.toBasicInfoDTO(basicInfoVo));
			System.out.println(dtoMapper.toBasicInfoDTO(basicInfoVo).getJumin());
		}
		
		
		return ResponseEntity.ok().body(result);
	}

}
