package com.edgar.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArticleApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8443");
		SpringApplication.run(ArticleApplication.class, args);
	}

}
