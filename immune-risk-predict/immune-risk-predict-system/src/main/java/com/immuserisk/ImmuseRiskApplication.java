package com.immuserisk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 添加此注解启用定时任务
@MapperScan(basePackages = {"com.immuserisk.dao"})
public class ImmuseRiskApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ImmuseRiskApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(ImmuseRiskApplication.class);
	}

}
