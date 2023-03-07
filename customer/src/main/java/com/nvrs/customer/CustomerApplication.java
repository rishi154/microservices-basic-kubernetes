package com.nvrs.customer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.google.gson.Gson;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerApplication {

	static Logger log = LoggerFactory.getLogger(CustomerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		Gson gson = new Gson();

		List<String> functionalityList = new ArrayList<String>();
		functionalityList.add("Merch8090");
		functionalityList.add("caseCreation");

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < functionalityList.size(); j++) {
				if (j == 0) {
					log.info(gson.toJson(new MyLogger(functionalityList.get(j), 15 + (int) (Math.random() * (50)))));
				} else {
					log.info(gson.toJson(new MyLogger(functionalityList.get(j), 2 + (int) (Math.random() * (10)))));
				}
			}
		}
	}

}
