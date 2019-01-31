import java.util.Random;

public class VirtualPet {
	
	private Random generator = new Random();
	
	String name;
	String description;
	int hunger;
	int thirst;
	int boredom;
	
	
	public VirtualPet(String nameParam, String descriptionParam) {
		name = nameParam;
		description = descriptionParam;
		
	}
	

	public VirtualPet (String nameParam, String descriptionParam, int hungerParam, int thirstParam, int boredomParam) {
		name = nameParam;
		description = descriptionParam;
		hunger = hungerParam;
		thirst = thirstParam;
		boredom = boredomParam;
		
	}	
	public void tick() {
		hunger += (5 + generateRandom());
		thirst += (5 + generateRandom());
		boredom += (1 + generateRandom());
		
	}
	public void reset() {
		hunger = 0;
		thirst = 0;
		boredom = 0;
		
	}
	
	private int generateRandom() {
			return generator.nextInt(10);
	}
	public String getName() {
		return name;
	}
	public void rename (String newname) {
		name = newname;
	}
	//hunger
	public int getHunger() {
		return hunger;		
	}
	public boolean isHungry() {
		return hunger >= 25;
	}
	public boolean isVeryHungry() {
		return hunger >= 50;
	}
	public void feed() {
		hunger = 0;
		thirst += 10;
		
	}
	public void giveDryPetFood() {
		hunger -= 40;
		thirst += 10;
	}
	public void giveWetPetFood() {
		hunger -= 50;
		thirst += 5;
	}
	public boolean hasStarved() {
		return hunger >= 150;
	}
	//thirst
	public int getThirst() {
		return thirst;
	}
	public boolean isThirsty() {
		return thirst >= 20;
	}
	public boolean isVeryThirsty() {
		return thirst >= 45;
	}
	public void water() {
		thirst = 0;
		
	}
	public boolean isDehydrated() {
		return thirst >= 150;
	}
	//bored
	public int getBoredom() {
		return boredom;
	}
	public void play() {
		hunger += 5;
		thirst += 5;
		boredom = 0;		
	}
	public boolean isBored() {
		return boredom >50;
	}
	
	@Override
	public String toString() {
		return ("[" + name +"]" + description);
	}


	
}



