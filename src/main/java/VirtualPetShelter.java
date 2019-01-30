import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	static Map<String,VirtualPet> pets = new HashMap<>();
	
	VirtualPet pet;

	private Collection<VirtualPet> feedPets;
	public void add(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
			
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	public static Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void adopt(VirtualPet pet1) {
		pets.remove(pet1.getPetName(), pet1);
	}

	public VirtualPet playWith(String petName) {
		VirtualPet playWith = findPet(petName);
		return playWith;
	}

	public Collection<VirtualPet> feedPets() {
		int hunger = 0;
		int thirst = 10;
		int cleanliness = 20; 
		return feedPets;
	
		
	}

	public void waterPets() {
		
		
	}


}






