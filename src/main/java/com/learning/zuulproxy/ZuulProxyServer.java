package com.learning.zuulproxy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulProxyServer {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyServer.class, args);
	}
	

}
