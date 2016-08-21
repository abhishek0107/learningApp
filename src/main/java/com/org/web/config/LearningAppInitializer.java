/**
 * 
 */
package com.org.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.org.service.config.ServiceConfiguration;
import com.org.web.secuirty.config.SecurityConfig;

/**
 * @author abhishek
 * class is a repalcement of web.xml
 *
 */
public class LearningAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {ServiceConfiguration.class,SecurityConfig.class};	
		//return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("/....................abhishek");
		// TODO Auto-generated method stub
		 return new Class<?>[] {WebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};	}

}
