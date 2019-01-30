
public class VirtualPet {

	public String petName;
	public String description;
	public int hunger;
	public int thirst;
	public int boredom;
	public int cleanliness;
	

	public VirtualPet(String petName, String description, int hunger, int thirst, int boredom, int cleanliness) {
		this.petName = petName;
		this.description = description;
	}
	public String getPetName() {
		return petName;
	}
	public String getPet() {
		return petName;
	}
	public int getBoredom() {
		return boredom;
	}
	public int getHunger() {
		return hunger;
	}
	public void playWith (int boredom) {
		boredom += boredom; 
	}
	public Object getWater() {
		return thirst;
	}

}



