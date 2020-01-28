package com.stock.history;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.stock.history")
public class WebStockAppHistoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStockAppHistoryServiceApplication.class, args);
	}

}
