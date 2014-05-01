package com.expr.server.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tanukisoftware.wrapper.WrapperListener;
import org.tanukisoftware.wrapper.WrapperManager;


public class AppStarter {

    private static final Logger logger = LoggerFactory.getLogger(AppStarter.class);
    private static AbstractApplicationContext applicationContext;

    public static void main( String[] args )
    {
        try {
            logger.info("Initializing JAx RS App");
            applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:jax_rs_context_config.xml"});
            applicationContext.start();
            logger.info("===============================================================");
            logger.info("==================== Jax RS App Started ========================");
            logger.info("===============================================================");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error occurred initializing Jax RS App", e);
        }
    }

}
