package com.jmhreif.verifyconnectivity;

import org.neo4j.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// tag::option1[]
@SpringBootApplication
public class VerifyConnectivityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VerifyConnectivityApplication.class, args);
	}

	final Driver driver;

	public VerifyConnectivityApplication(@Autowired Driver driver) {
		this.driver = driver;
	}

	public final void run(String... args) {
		driver.verifyConnectivity();
	}
}
// end::option1[]