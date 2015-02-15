package pf.blog.config;

import java.util.Properties;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.mvc.UrlFilenameViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"pf.blog"})
public class Config {
	
	@Bean
	public CustomScopeConfigurer customScopeConfigurer() {
		CustomScopeConfigurer csc = new CustomScopeConfigurer();
		csc.addScope("view", new ViewScope());
		
		return csc;
	}
}
