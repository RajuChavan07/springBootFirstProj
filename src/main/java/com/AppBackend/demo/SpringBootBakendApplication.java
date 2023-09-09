package com.AppBackend.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class SpringBootBakendApplication {

	/*
	 * echo "# springBootFirstProj" >> README.md git init git add README.md git
	 * commit -m "first commit" git branch -M main git remote add origin
	 * https://github.com/RajuChavan07/springBootFirstProj.git git push -u origin
	 * main
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBakendApplication.class, args); 
	}

}
