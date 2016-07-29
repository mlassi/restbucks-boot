package com.restbucks.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.restbucks.domain.model")
@EnableJpaRepositories("com.restbucks.domain.repository")
@EnableAutoConfiguration
@Configuration
public class JpaConfig {

}
