package com.jfz.sheng;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaShengApplication {

	@Value("${server.port}")
	private String port;
	public static void main(String[] args) {
		SpringApplication.run(EurekaShengApplication.class, args);
	}



	@RequestMapping("/sheng")
	public String home(@RequestParam String name ){
		return name + ",erueka-sheng service from port "+port;
	}

	@RequestMapping("/info")
	public String info(){
		return "Erueka-sheng service from port "+port;
	}
}
