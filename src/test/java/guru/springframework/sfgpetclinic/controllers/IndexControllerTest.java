package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

@Tag("Controllers")
class IndexControllerTest {

	IndexController controller;

	@BeforeEach
	void setUp() {
		controller = new IndexController();
	}

	@DisplayName("Test Proper View name is returned for index page")
	@Test
	void index() {
		assertEquals("index", controller.index());
		assertEquals("index", controller.index(), "Wrong View Returned");

		assertEquals("index", controller.index(), () -> "Another Expensive Message " +
				"Make me only if you have to");
	}

	@Test
	@DisplayName("Test Exception")
	void oupsHandler() {
		assertThrows(ValueNotFound.class, () -> controller.oopsHandler());
	}

	@Test
	@Disabled("Demo of timeout")
	void testTimeout() {
		assertTimeout(Duration.ofMillis(100), () -> Thread.sleep(5000));

		System.out.println("I got here");
	}

	@Test
	@Disabled("Demo of timeout Preemptively")
	void testTimeoutPrempt() {
		assertTimeoutPreemptively(Duration.ofMillis(100), () -> Thread.sleep(2000));
		System.out.println("I got here too");
	}

	@Test
	void testAssumptionTrue() {
		assumeTrue("Stavros".equalsIgnoreCase(System.getenv("Stavros_4")));
	}

	@Test
	@DisplayName("The assumption is true")
	void testAssumptionTrueAssumptionIsTrue() {
		assumeTrue("Stavros".equalsIgnoreCase("Stavros"));
	}
}