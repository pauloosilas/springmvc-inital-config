/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sumpaulo.spring.initial.config.config;

import br.com.sumpaulo.spring.initial.config.controllers.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author paulo
 */
@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class})
public class AppWebConfiguration {
    
    
    
@Bean
public InternalResourceViewResolver internalResourceViewResolver() {
    InternalResourceViewResolver resolver = 
                               new InternalResourceViewResolver();
    
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    
    return resolver;
    }
}
