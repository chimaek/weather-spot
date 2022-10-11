package net.chimaek.weatherspot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class WeatherKey {

    private final Property property;

    @Autowired
    public WeatherKey(Property property) {
        this.property = property;
    }

    @Bean
    public String getKey() {
        return property.getApi_key();
    }

}
