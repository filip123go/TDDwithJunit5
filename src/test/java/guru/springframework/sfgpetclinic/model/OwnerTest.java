package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.ParameterizedTest.DEFAULT_DISPLAY_NAME;

class OwnerTest implements ModelTests {

	@Test
	void dependentAssertions() {

		Owner owner = new Owner(1l, "Joe", "Buck");
		owner.setCity("Key West");
		owner.setTelephone("1231231234");
		owner.setAddress("North Street 17");

		assertAll("Properties Test",
				() -> assertAll("Person Properties",
						() -> assertEquals("Joe", owner.getFirstName(), "-----First Name Did not Match-------"),
						() -> assertEquals("Buck", owner.getLastName())),
				() -> assertAll("Owner Properties",
						() -> assertEquals("Key West", owner.getCity(), "-----City Did Not Match------"),
						() -> assertEquals("1231231234", owner.getTelephone()),
						() -> assertEquals("North Street 17", owner.getAddress(), "-----City Did Not Match------")
				));
	}

	@DisplayName("Value Source Test - ")
	@ParameterizedTest(name = "{displayName}" + DEFAULT_DISPLAY_NAME)
	@ValueSource(strings = {"Spring", "Framework", "Guru"})
	void testValueSource(String val) {
		System.out.println(val);

	}


	@DisplayName("Enum Source Test - ")
	@ParameterizedTest(name = "{displayName}" + DEFAULT_DISPLAY_NAME)
	@EnumSource(OwnerType.class)
		//iterate through the enumeration and pass each value in enumTest
	void enumTest(OwnerType ownerType) {
		System.out.println(ownerType);
	}

	@DisplayName("Csv Input Test - ")
	@ParameterizedTest(name = "{displayName}" + DEFAULT_DISPLAY_NAME)
	@CsvSource({
			"FL, 1, 1",
			"OH, 1, 2",
			"MI, 3, 1"
	})
	void csvInputTest(String stateName, int val1, int val2) {
		System.out.println(stateName + "=" + val1 + ":" + val2);
	}

	@DisplayName("Csv From File Test - ")
	@ParameterizedTest(name = "{displayName}" + DEFAULT_DISPLAY_NAME)
	@CsvFileSource(resources = "/input.csv", numLinesToSkip = 1)
	void csvFromFileTest(String stateName, int val1, int val2) {
		System.out.println(stateName + "=" + val1 + ":" + val2);
	}

}