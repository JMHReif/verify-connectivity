package com.jmhreif.verifyconnectivity;

import org.neo4j.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config implements CommandLineRunner {
    final Driver driver;

    public Config(@Autowired Driver driver) {
        this.driver = driver;
    }

    public final void run(String... args) {
        driver.verifyConnectivity();
    }
}
