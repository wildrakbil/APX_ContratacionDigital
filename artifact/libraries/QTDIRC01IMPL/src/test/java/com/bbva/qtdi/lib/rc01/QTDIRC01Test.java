package com.bbva.qtdi.lib.rc01;

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
		"classpath:/META-INF/spring/QTDIRC01-app.xml",
		"classpath:/META-INF/spring/QTDIRC01-app-test.xml",
		"classpath:/META-INF/spring/QTDIRC01-arc.xml",
		"classpath:/META-INF/spring/QTDIRC01-arc-test.xml" })
public class QTDIRC01Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(QTDIRC01.class);
	
	@Resource(name = "qtdiRC01")
	private QTDIRC01 qtdiRC01;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.qtdiRC01;
		if(this.qtdiRC01 instanceof Advised){
			Advised advised = (Advised) this.qtdiRC01;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		qtdiRC01.execute();
	}
	
}
