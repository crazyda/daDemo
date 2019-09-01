package com.demo.higth.ch03.fortest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {TestConfig.class})
//@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

	@Autowired
	private TestBean testBean ;
	
	public void prodBeanShouldInject() {
		String expected = "from production profile";
		String actual = testBean.getContent();
	}
}
