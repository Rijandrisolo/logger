package diginamic.fr.monprojet.maven001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

/** class AppMaven001 
 * 
 * Executable 
 * @author rijan
 *
 */


public class AppMaven001 {
	
	/**
	 * @return 
	 * 
	 * 
	 * 
	 */
	
	
		private static final Logger LOG = LoggerFactory.getLogger(AppMaven001.class);
		public static void main(String[] args) {
			
			LOG.info("Bonjour Slf4J !");
			LOG.info("Implementation Logback");
			AppService.executer("Ajout executer() dans AppMaven001");
			
			System.out.println("Bonjour Slf4J !");
			System.out.println("Implementation Logback");
			
			
			}
		

}
