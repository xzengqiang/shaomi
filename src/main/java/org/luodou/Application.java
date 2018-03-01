package org.luodou;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.xjj.framework.core.util.SpringContextUtil;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"org.luodou","com.xjj"})
@EnableJpaAuditing
@EnableScheduling
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    private Environment environment;

    @Override
    public void run(String... args) throws Exception {
        log.info("active profiles [{}] ", new Object[]{environment.getActiveProfiles()});
    }

	@Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Bean
    @PostConstruct
    public SpringContextUtil initSpringContextUtil(){
        return SpringContextUtil.getInstance();
    }

    public static void main(String[] args) {
        log.info("Args:[{}]", new Object[]{args});
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}