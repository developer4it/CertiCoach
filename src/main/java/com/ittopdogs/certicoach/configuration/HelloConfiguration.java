package com.ittopdogs.certicoach.configuration;

import com.ittopdogs.certicoach.provider.HelloMessageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /* ✚ Adding new configuration annotation line */
public class HelloConfiguration {

    @Bean
    HelloMessageProvider messageProvider() {
        return new HelloMessageProvider();
    }
}
