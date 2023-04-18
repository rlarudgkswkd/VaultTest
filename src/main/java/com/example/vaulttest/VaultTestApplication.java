package com.example.vaulttest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class VaultTestApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(VaultTestApplication.class);
    private Credential credential ;

    public VaultTestApplication(Credential credential) {
        this.credential = credential;
    }

    public static void main(String[] args) {
        SpringApplication.run(VaultTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("--------properties-------");
        logger.info("Access Key : "+ credential.getAccess_key());
        logger.info("Secret Key : "+ credential.getSecret_key());

    }
}
