package com.huazheng.providerservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages="com.huazheng.providerservice.service")
public class ProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceApplication.class, args);
	}

}
