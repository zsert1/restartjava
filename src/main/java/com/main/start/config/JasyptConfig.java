package com.main.start.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {
    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor(){
        String key="Mm+XOA3Tco2TtAlgK4rubu78d4BGnEiGeXfGUjtS4bO7I3aQicsoLJb2OhshQjuI";
        PooledPBEStringEncryptor encryptor=new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config=new SimpleStringPBEConfig();
        config.setPassword(key);
        config.setAlgorithm("PBEWITHMD5ANDDES");
        config.setPoolSize("1");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        encryptor.setConfig(config);
        return encryptor;
    }

}
