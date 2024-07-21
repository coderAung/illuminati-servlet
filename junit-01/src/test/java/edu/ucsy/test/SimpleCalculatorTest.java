package edu.ucsy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.ucsy.demo.SimpleCalulator;

@TestMethodOrder(OrderAnnotation.class)
public class SimpleCalculatorTest {

	private static SimpleCalulator calculator;
	
	@BeforeAll
	static void init() {
		calculator = new SimpleCalulator();
	}

	@Order(1)
	@ParameterizedTest
	@CsvSource(value = {
			"1,2,3", "10,90,100", "22,11,33"
	})
	void add_test(int a, int b, int result) {
		var answer = calculator.add(a, b);
		assertEquals(result, answer);
	}
	
	@Order(2)
	@ParameterizedTest
	@CsvSource(value = {
			"1,2,5", "10,90,200", "22,11,40"
	})
	void add_test_fail(int a, int b, int result) {
		var answer = calculator.add(a, b);
		assertNotEquals(result, answer);
	}
	
	@Order(3)
	@ParameterizedTest
	@CsvSource(value = {
			"1,2,-1", "100,90,10", "22,11,11"
	})
	void sub_test(int a, int b, int result) {
		var answer = calculator.sub(a, b);
		assertEquals(result, answer);
	}
	
}
