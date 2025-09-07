package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScans({
        @ComponentScan("org.example.entity")
})
@EnableAspectJAutoProxy
public class MainConfiguration {
}
