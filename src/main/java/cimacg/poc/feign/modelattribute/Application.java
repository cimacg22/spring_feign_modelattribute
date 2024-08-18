package cimacg.poc.feign.modelattribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the application
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    /**
     * Main method to start the application
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
