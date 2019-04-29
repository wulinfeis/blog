package com.bjsxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.bjsxt.mapper") 
public class App extends SpringBootServletInitializer{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
        return app.sources(App.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
