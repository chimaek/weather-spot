package net.chimaek.weatherspot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Configuration
public class CryptUtils {

    @Bean
    public MessageDigest getDigest() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA3-256");

    }
}
