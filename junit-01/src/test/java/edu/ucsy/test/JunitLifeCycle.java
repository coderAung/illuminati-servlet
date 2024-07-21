package edu.ucsy.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class JunitLifeCycle {

	@BeforeAll
	static void init() {
		System.out.println("Test Method is started");
	}

	@BeforeEach
	void greet() {
		System.out.println("\nEach test is working");
		System.out.println("----------------------");
	}

	@AfterEach
	void stop() {
		System.out.println("----------------------");
		System.out.println("Test is completed.\n");
	}

	@Order(2)
	@Test
	void test1() {
		System.out.println("Test one is working");
	}

	@Order(1)
	@Test
	void test2() {
		System.out.println("Test two is working");
	}

	@AfterAll
	static void end() {
		System.out.println("Test is ended");
	}
}
