package com.ubt.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ubt.*"})
@EntityScan(basePackages = {"com.ubt.*"}) //
@EnableJpaRepositories(basePackages = {"com.ubt.*"}) //  merr apo fut te dhena
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
