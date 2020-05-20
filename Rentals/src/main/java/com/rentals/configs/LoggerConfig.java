package com.rentals.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by sylvester
 * Project Rentals-Booking-System
 * User: sylvester
 * Date: 5/20/20
 * Time: 7:23 PM
 */
@Configuration
public class LoggerConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Logger produceLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }
}

