package edu.alexandru.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Alexandru on 10-Jan-16.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "edu.alexandru.components")
public class WebConfig extends WebMvcConfigurerAdapter {
}
