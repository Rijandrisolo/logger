package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import diginamic.fr.monprojet.maven001.AppMaven001;

public class AppService  {

	private static final Logger LOG= LoggerFactory.getLogger(AppService.class);
	public static void executer(String param) {
		
		LOG.debug("Traitement 1 : param = {}", param);
	}
}
