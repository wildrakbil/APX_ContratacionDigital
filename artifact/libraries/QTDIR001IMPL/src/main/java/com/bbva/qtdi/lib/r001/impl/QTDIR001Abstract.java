package com.bbva.qtdi.lib.r001.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.elara.utility.jdbc.JdbcUtils;
import com.bbva.qtdi.lib.r001.QTDIR001;

public abstract class QTDIR001Abstract extends AbstractLibrary implements QTDIR001 {

	private static final Logger LOGGER = LoggerFactory.getLogger(QTDIR001.class);
	
	protected ApplicationConfigurationService applicationConfigurationService;
	
	protected JdbcUtils jdbcUtils;
	
	/**
	 * @param applicationConfigurationService the applicationConfigurationService to set
	 */
	public void setApplicationConfigurationService(
			ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}
	
	
	/**
	 * @param jdbcUtils the jdbcUtils to set
	 */
	public void setJdbcUtils(JdbcUtils jdbcUtils) {
		this.jdbcUtils = jdbcUtils;
	}
}
