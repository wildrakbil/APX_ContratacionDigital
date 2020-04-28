package com.bbva.qtdi.lib.rc02;

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
		"classpath:/META-INF/spring/QTDIRC02-app.xml",
		"classpath:/META-INF/spring/QTDIRC02-app-test.xml",
		"classpath:/META-INF/spring/QTDIRC02-arc.xml",
		"classpath:/META-INF/spring/QTDIRC02-arc-test.xml" })
public class QTDIRC02Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(QTDIRC02.class);
	
	@Resource(name = "qtdiRC02")
	private QTDIRC02 qtdiRC02;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.qtdiRC02;
		if(this.qtdiRC02 instanceof Advised){
			Advised advised = (Advised) this.qtdiRC02;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		qtdiRC02.execute();
	}
	
}
