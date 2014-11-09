/**
 * 
 */
package NRFG.Config;

/**
 * @author ery
 *
 */

//import org.apache.commons.configuration.ConfigurationException;
//import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.configuration.*;

public class Parser {
	public Parser(String[] args) {

			//XMLConfiguration config = new XMLConfiguration("NRFG.xml");
			Parameters params = new Parameters();
			FileBasedConfigurationBuilder<XMLConfiguration> builder = 
					new FileBasedConfigurationBuilder<XMLConfiguration>(XMLConfiguration.class)
					.configure(params.xml())
						.setFileName("config.xml");
			XMLConfiguration config = builder.getConfiguration();
	}
}
