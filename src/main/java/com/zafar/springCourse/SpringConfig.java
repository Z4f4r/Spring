package com.zafar.springCourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zafar.springCourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
