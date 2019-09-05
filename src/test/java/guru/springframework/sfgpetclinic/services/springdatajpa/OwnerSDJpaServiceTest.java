package guru.springframework.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OwnerSDJpaServiceTest {

	OwnerSDJpaService service;

	@BeforeEach
	void setUp() {
		service = new OwnerSDJpaService(null, null, null);
	}

	@Disabled //ignore test
	@Test
	void findByLastName() {
		Owner foundOwner = service.findByLastName("Filip");
	}

	@Test
	void findAllByLastNameLike() {
	}

	@Test
	void findAll() {
	}

	@Test
	void findById() {
	}

	@Test
	void save() {
	}

	@Test
	void delete() {
	}

	@Test
	void deleteById() {
	}
}