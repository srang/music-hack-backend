package com.github.srang.music.hack.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by srang on 11/11/2017.
 */
public class FaviconConfig {
    @Bean
    public WebMvcConfigurerAdapter faviconWebMvcConfiguration() {
        return new FaviconWebMvcConfiguration();
    }

    public class FaviconWebMvcConfiguration extends WebMvcConfigurerAdapter {
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.setOrder(Integer.MIN_VALUE);
            registry.addResourceHandler("/favicon.ico")
                .setCachePeriod(0);
        }
    }
}
