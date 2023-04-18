package com.example.vaulttest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class Credential {

    private String access_key;
    private String secret_key;
}
