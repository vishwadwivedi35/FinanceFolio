package com.glzd.expenseTrackerApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Custom resource handler for CSS files
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/css/");

        // Custom resource handler for image files
        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/");
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Redirect root URL to /expense
        registry.addRedirectViewController("/", "/expenses");
    }
}
