package com.mrlonis.genshinimpact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoGenshinImpactSpringBootApplication implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/api/images/**").addResourceLocations("classpath:/images/")
                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoGenshinImpactSpringBootApplication.class, args);
    }

}
