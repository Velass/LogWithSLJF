package com.tpunitaire;
import com.tpunitaire.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Bonjour Slf4J !");
        LOG.info("Implementation Logback");
        AppService test = new AppService() ;
        test.executer("test");
    }

    

}
