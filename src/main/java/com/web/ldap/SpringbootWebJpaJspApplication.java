package com.web.ldap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.web.ldap.dao.DefiningRepositoryInterfaces.FinetuningRepositoryDefinition.CustomUserMyBaseRepository;

@SpringBootApplication
/*@EnableCaching*/
public class SpringbootWebJpaJspApplication implements CommandLineRunner /*extends SpringBootServletInitializer*/ {
/*@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder.sources(SpringbootWebJpaJspApplication.class);
}*/
	@Autowired
	CustomUserMyBaseRepository customUserMyBaseRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebJpaJspApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(	"This is Created"+customUserMyBaseRepository.findByEmailAddress("dasarishiva1@gmail.com"));
	
		
	}
}
