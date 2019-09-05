package guru.springframework.sfgpetclinic.model;


import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

public class Owner extends Person {

@Getter	@Setter private String address;
@Getter	@Setter private String city;
@Getter	@Setter private String telephone;
@Getter	@Setter private Set<Pet> pets = new HashSet<>();


    public Owner(Long id, String firstName, String lastName) {
        super(id, firstName, lastName); // this is from the Person class
    }

    public Pet getPet(String name) {
        return getPet(name, false);
    }

    /**
     * Return the Pet with the given name, or null if none found for this Owner.
     *
     * @param name to test
     * @return true if pet name is already in use
     */
    public Pet getPet(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for (Pet pet : pets) {
            if (!ignoreNew || !pet.isNew()) {
                String compName = pet.getName();
                compName = compName.toLowerCase();
                if (compName.equals(name)) {
                    return pet;
                }
            }
        }
        return null;
    }
}
