/**
 * 
 */
package NRFG.Config;

/**
 * @author ery
 *
 */

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.configuration.*;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.configuration.beanutils.BeanDeclaration;
import org.apache.commons.configuration.beanutils.BeanHelper;
import org.apache.commons.configuration.beanutils.XMLBeanDeclaration;

import org.apache.commons.configuration.FileConfiguration;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.HierarchicalConfiguration;
import org.apache.commons.configuration.StrictConfigurationComparator;
import org.apache.commons.configuration.ConfigurationComparator;
import org.apache.commons.configuration.plist.XMLPropertyListConfiguration;

//import org.apache.commons.configuration2.XMLConfiguration;
//import org.apache.commons.configuration2.ex.ConfigurationException;
//import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
//import org.apache.commons.configuration2.builder.fluent.Parameters;

public class Parser {
	private FileConfiguration config;
	
	public Parser(String[] args) throws ConfigurationException{
			
		config = new XMLPropertyListConfiguration();
		config.setFileName("sources.xml");
		config.load();
		
			//XMLConfiguration config = new XMLConfiguration("NRFG.xml");
//			Parameters params = new Parameters();
//			FileBasedConfigurationBuilder<XMLConfiguration> builder = 
//					new FileBasedConfigurationBuilder<XMLConfiguration>(XMLConfiguration.class)
//					.configure(params.xml()
//						.setFileName("config.xml")
//						.setValidating(true));
//			XMLConfiguration config = builder.getConfiguration();
		
	}
}
