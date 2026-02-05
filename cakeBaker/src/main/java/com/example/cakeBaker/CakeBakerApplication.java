package com.example.cakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakeBakerApplication implements CommandLineRunner {

	CakeBaker cakeBaker;
	@Autowired
	public CakeBakerApplication(CakeBaker cakeBaker){
		this.cakeBaker = cakeBaker;
	}
	public static void main(String[] args) {
		SpringApplication.run(CakeBakerApplication.class, args);
	}

	@Override
	public void run(String... val){
		cakeBaker.bakeCake();
	}

}
