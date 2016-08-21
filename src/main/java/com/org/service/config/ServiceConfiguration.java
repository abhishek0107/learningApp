package com.org.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author abhishek
 * equivalent to aplication context. we can create bean
 */
@Configuration
public class ServiceConfiguration {
@Bean(name = "dataSource")
	
	public DriverManagerDataSource dataSource() {
		System.out.println("hiiiiiiiii");
	    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
	    driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/abhishek_218216");
	    driverManagerDataSource.setUsername("root");
	    driverManagerDataSource.setPassword("a");
	    return driverManagerDataSource;
	}
}
