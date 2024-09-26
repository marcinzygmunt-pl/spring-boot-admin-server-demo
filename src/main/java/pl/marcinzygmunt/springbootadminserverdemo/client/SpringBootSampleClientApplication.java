package pl.marcinzygmunt.springbootadminserverdemo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.WebApplicationInitializer;


@SpringBootApplication
@EnableScheduling
public class SpringBootSampleClientApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootSampleClientApplication.class);

    public static void main(String[] args) {
      SpringApplication sa = new SpringApplication(SpringBootSampleClientApplication.class);
      sa.setAdditionalProfiles("client");
      sa.run(args);
    }

    @Scheduled(cron = "0 * * * * *")
    void scheduled() {
        log.info("Sample scheduler");
    }

}
