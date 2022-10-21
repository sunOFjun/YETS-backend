package com.sj.yets.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;

import com.sj.yets.controller.BasicInfoController;
import com.sj.yets.service.BasicInfoService;
import com.sj.yets.service.vo.BasicInfoVO;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(BasicInfoController.class)
@ComponentScan(
		  basePackageClasses = {
		    DTOMapper.class
		  })
public class BasicInfoControllerTests {

	@Autowired
	private MockMvc mvc;
	
	@MockBean 
    private BasicInfoService basicInfoService;
	
	@Test
	public void test_getBacisInfo() throws Exception {
		
		List<BasicInfoVO> result = new ArrayList<BasicInfoVO>();
		BasicInfoVO basicInfoVO = new BasicInfoVO();
		basicInfoVO.setName("김선준");
		basicInfoVO.setJumin("940604-1006520");
	    result.add(basicInfoVO);
	           
	    basicInfoVO = new BasicInfoVO();
		basicInfoVO.setName("김현수");
		basicInfoVO.setJumin("930913-1111111");
	    result.add(basicInfoVO);
		        
	    when(basicInfoService.getBasicInfo()).thenReturn(result);
	    
		this.mvc.perform(get("/api/v1/basicInfo"))
		.andExpect(status().isOk());
	}
}
