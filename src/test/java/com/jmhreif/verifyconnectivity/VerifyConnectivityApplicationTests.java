package com.jmhreif.verifyconnectivity;

import org.junit.jupiter.api.Test;
import org.neo4j.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VerifyConnectivityApplicationTests {

	// tag::option3[]
	final Driver driver;
	public VerifyConnectivityApplicationTests(@Autowired Driver driver) {
		this.driver = driver;
	}

	@Test
	final void testConnection() {
		driver.verifyConnectivity();
	}
	// end::option3[]

}
