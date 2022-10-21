package com.sj.yets.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sj.yets.repository.mybatis.BasicInfoRepositoryDAO;
import com.sj.yets.service.vo.BasicInfoVO;

@ExtendWith(MockitoExtension.class)
public class BasicInfoServiceTests {
	
	@Mock
	private BasicInfoRepositoryDAO basicInfoDAO;
	@Test
    public void test_getBasicInfo() {
        BasicInfoService campaignService = new BasicInfoServiceImpl(basicInfoDAO, new VOMapperImpl());
        
        List<BasicInfoVO> list = campaignService.getBasicInfo();
        assertThat(list).extracting("name", "jumin").contains(
                tuple("김선준", "940604-1006520"),
                tuple("김현수", "930913-1111111")
                );
    }
}
