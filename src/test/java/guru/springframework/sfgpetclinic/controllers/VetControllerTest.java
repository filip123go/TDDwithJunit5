package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.ControllerTests;
import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.fauxspring.ModelMapImpl;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VetControllerTest implements ControllerTests {

	VetService vetService;
	SpecialtyService specialtyService;

	VetController vetController;

	@BeforeEach
	void setup() {
		specialtyService = new SpecialityMapService();
		vetService = new VetMapService(specialtyService);

		vetController = new VetController(vetService);

	}

	@Test
	void listVets() {
		Model model = new ModelMapImpl();

	}
}