package com.bbva.qtdi.lib.r002;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/QTDIR002-app.xml",
		"classpath:/META-INF/spring/QTDIR002-app-test.xml",
		"classpath:/META-INF/spring/QTDIR002-arc.xml",
		"classpath:/META-INF/spring/QTDIR002-arc-test.xml" })
public class QTDIR002Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(QTDIR002.class);
	
	@Resource(name = "qtdiR002")
	private QTDIR002 qtdiR002;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.qtdiR002;
		if(this.qtdiR002 instanceof Advised){
			Advised advised = (Advised) this.qtdiR002;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		qtdiR002.execute();
	}
	
}
