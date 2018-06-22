package com.asiaInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement; 

import java.net.UnknownHostException;

// same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication(exclude = JmxAutoConfiguration.class)
@ServletComponentScan
@EnableScheduling
@EnableTransactionManagement        //事务管理
public class Application {
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(Application.class);
        Environment environment = app.run(args).getEnvironment();
    }
}
