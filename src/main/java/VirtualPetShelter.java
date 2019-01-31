import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String,VirtualPet> mapOfPets = new HashMap<String,VirtualPet>();
	public Collection<VirtualPet>pets(){
		return mapOfPets.values();
	}
	
	public void intake(VirtualPet pet) {
		mapOfPets.put(pet.name, pet);
	}
	public void adopt(VirtualPet pet) {
		mapOfPets.remove(pet.name);
	}
	public void feedPets() {
		for(VirtualPet currentPet: pets()) {
			currentPet.feed();
		}
	}
	public void waterPets() {
		for(VirtualPet currentPet: pets()) {
			currentPet.water();
		}
	}
	public void playWith(String petName) {
		for(VirtualPet currentPet: pets()) 
		currentPet.play();
		}
			
	public void tick() {
		for(VirtualPet currentPet: pets()) {
			currentPet.tick();
		}
	}
	
	@Override
	public String toString() {
		return("" + mapOfPets.keySet() + mapOfPets.values());
	}


		
	}


	







