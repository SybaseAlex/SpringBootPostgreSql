package com.amtoss;

import com.amtoss.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * current configuration allow to run application on Apache Tomcat
 * just chose on file 'Run File...' in IDE
*/
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[] {DemoApplication.class, JpaConfig.class}, args);
    }
}
