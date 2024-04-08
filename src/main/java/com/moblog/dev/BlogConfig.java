package com.moblog.dev;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlogConfig {
    @Bean
    ArrayList<Blog> arrayList(){
        return new ArrayList<>();
    }
}
