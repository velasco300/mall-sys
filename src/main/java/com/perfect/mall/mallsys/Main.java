package com.perfect.mall.mallsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.perfect.mall.mallsys.mapper")
public class Main {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Main.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
