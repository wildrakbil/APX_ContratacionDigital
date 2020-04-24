package com.bbva.qtdi.lib.r001;

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
		"classpath:/META-INF/spring/QTDIR001-app.xml",
		"classpath:/META-INF/spring/QTDIR001-app-test.xml",
		"classpath:/META-INF/spring/QTDIR001-arc.xml",
		"classpath:/META-INF/spring/QTDIR001-arc-test.xml" })
public class QTDIR001Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(QTDIR001.class);
	
	@Resource(name = "qtdiR001")
	private QTDIR001 qtdiR001;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.qtdiR001;
		if(this.qtdiR001 instanceof Advised){
			Advised advised = (Advised) this.qtdiR001;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		qtdiR001.execute();
	}
	
}
