package com.example.countryrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
public class CountryRestApplication {

    @Bean
    MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofKilobytes(128));
        factory.setMaxRequestSize(DataSize.ofKilobytes(128));
        return factory.createMultipartConfig();
    }

    public static void main(String[] args) {
        SpringApplication.run(CountryRestApplication.class, args);
    }

}
