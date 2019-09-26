package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
						() -> assertEquals("North Street 17" , owner.getAddress() , "-----City Did Not Match------")
				));
	}
}