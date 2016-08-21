/**
 * 
 */
package com.org.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.org.web.secuirty.config.SecurityConfig;

/**
 * @author abhishek
 * this class is replacement of mvc-configuration 
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.org.*"})
@Import({SecurityConfig.class})
public class WebConfiguration {
	
	
	@Bean
	public ViewResolver internalResourceViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	}
}
