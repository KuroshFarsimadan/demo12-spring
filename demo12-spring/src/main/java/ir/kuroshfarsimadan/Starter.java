package ir.kuroshfarsimadan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

	final static Logger logger = LoggerFactory.getLogger(Starter.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		logger.info("Starting the program.");

		logger.debug("Loading application context");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");

		System.out.println(context.getBean("car"));
		System.out.println(context.getBean("car"));

		logger.debug("Closing application context");
		context.close();

		logger.info("Program execution ended.");
		
		/*
		 * 	Example output
			0    [main] INFO  ir.kuroshfarsimadan.Starter  - Starting the program.
			206  [main] INFO  org.springframework.context.support.ClassPathXmlApplicationContext  - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@379619aa: startup date [Wed Jul 11 15:47:58 EDT 2018]; root of context hierarchy
			268  [main] INFO  org.springframework.beans.factory.xml.XmlBeanDefinitionReader  - Loading XML bean definitions from class path resource [spring-conf.xml]
			BMWR1R2R3R4 (ir.kuroshfarsimadan.Car@56aac163)
			BMWR1R2R3R4 (ir.kuroshfarsimadan.Car@56aac163)
			538  [main] INFO  org.springframework.context.support.ClassPathXmlApplicationContext  - Closing org.springframework.context.support.ClassPathXmlApplicationContext@379619aa: startup date [Wed Jul 11 15:47:58 EDT 2018]; root of context hierarchy
			539  [main] INFO  ir.kuroshfarsimadan.Starter  - Program execution ended.
		 */
	}

}
