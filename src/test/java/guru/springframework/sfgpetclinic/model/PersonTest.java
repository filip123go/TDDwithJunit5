package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;
import static org.junit.jupiter.api.RepeatedTest.SHORT_DISPLAY_NAME;

class PersonTest implements ModelTests {

	@Test
	void groupedAssertions() {
		//given
		Person person = new Person(1l, "Joe", "Buck");

		//then
		assertAll("Test Props Set",
				() -> assertEquals(person.getFirstName(), "Joe"),
				() -> assertEquals(person.getLastName(), "Buck"));
	}

	@Test
	void groupedAssertionMsgs() {
		//given
		Person person = new Person(1l, "Joe", "Buck");

		//then
		assertAll("Test Props Set",
				() -> assertEquals(person.getFirstName(), "Joe", "First Name Failed"),
				() -> assertEquals(person.getLastName(), "Buck", "Last Name Failed"));
	}

	@RepeatedTest(value = 10, name = LONG_DISPLAY_NAME)
	@DisplayName("My repeated test")
	@Test
	void myRepeatedTest() {
		//todo - impl
	}
}