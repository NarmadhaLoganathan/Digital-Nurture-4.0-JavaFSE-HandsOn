Hands on 3
Spring Core - Incorporate Logging 

Incorporate logging in the Spring Boot project created in previous hands on. Refer steps below: 
•	Create application.properties if not yet created in src/main/resources folder
•	Add below lines in application.properties
logging.level.org.springframework=info
logging.level.com.cognizant.springlearn=debug
logging.pattern.console=%d{yyMMdd}|%d{HH:mm:ss.SSS}|%-20.20thread|%5p|%-25.25logger{25}|%25M|%m%n
•	In SpringLearnApplication.java include the following imports:
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
•	Include the below static variable in SpringLearnApplication.java:
private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
•	Include info log on start and end of method. Debug log for displaying the date (refer code below)
public void displayDate() {
    LOGGER.info(“START”);
    //..
    LOGGER.debug(date);
    //..
    LOGGER.info(“END”);
}
IMPORTANT NOTE: Going forward all methods should incorporate logging as specified above. Never use System.out.println().
