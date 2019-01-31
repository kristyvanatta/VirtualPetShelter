import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		
		boolean quit = false;
		VirtualPet sweetie = new VirtualPet ("Sweetie", "is a timid sole that loves to cuddle", 50, 50, 50);
		shelter.intake(sweetie);
		VirtualPet pongo = new VirtualPet ("Pongo", "is a hyperactive puppy", 50, 50, 50);
		shelter.intake(pongo);
		VirtualPet lacy = new VirtualPet ("Lacy", "is a fat cat", 50, 50, 50);
		shelter.intake(lacy);
		
		do {
			writeLine("\nThank you for volunteering at Happy Pets Animal Shelter!");
			writeLine("\nHere is the status report for the pets:");
			writeLine("Name\t|tHunger \t|Thirst  \t|Boredom ");
			writeLine("--------|--------|--------|--------");
			
			for (VirtualPet currentPet:shelter.pets()) {
				writeLine(currentPet.name + "\t|" + currentPet.hunger + "\t|" + currentPet.thirst + "\t|" + currentPet.boredom );
			}
			writeLine("What would you like to do next?");
			writeLine("1. Feed the pets \n2. Water the pets \n3. Play with a pet \4. Adopt a pet \5. Admit a pet ");
			String response = input.nextLine();
			
			switch (response) {
			case "1"://feed pets
				shelter.feedPets();
				writeLine("Thank you, the pets were hungry!");
				break;
				
			case "2"://water pets
				shelter.waterPets();
				writeLine("Oh boy!, they sure did drink a lot!");
				break;
				
			case "3"://play with a pet
				writeLine("The pets look bored. Would you like to chose one to play with?\n");
				displayPets(shelter);
				writeLine("\nWho would you like to choose?");
				String petName = input.nextLine();
				shelter.playWith(petName);
				writeLine("You chose" + petName + "to play.");
				break;
				
			case "4"://adoption
				writeLine("You would like to adopt a pet. Fantastic!These pets are available:\n");
				displayPets(shelter);
				writeLine("\nWho would you like to choose?");
				String nameToAdopt = input.nextLine();
				VirtualPet x = shelter(shelter).getPet(nameToAdopt);
				shelter.adopt(x);
				writeLine("You adopted" + nameToAdopt + "I know you will take good care of your new pet");
				break;
				
			case "5"://drop off a pet
				writeLine("Please enter the new pets name:");
				String name = input.nextLine();
				writeLine("Please describe the pet:");
				String description = input.nextLine();
				VirtualPet p = new VirtualPet(name, description);
				shelter.intake(p);
				writeLine("Thank you for bringing in " + p.getName() + "! We will take good care of this new pet");
				break;
				
			
			case "6": // do nothing
				break;
				
			case "7": //leave the shelter
				writeLine("Thank you for helping out today, see you next time!");
				System.exit(0);
				
			default:
				writeLine("I'm sorry, I didn't understand you. Please select again");
				break;
			
			}
			shelter.tick();
			
		}while(!quit);
		input.close();
					
		}
	private static VirtualPetShelterApp shelter(Object virtualpetshelter) {
		// TODO Auto-generated method stub
		return null;
	}
	private VirtualPet getPet(String nameToAdopt) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void writeLine(String message) {
		System.out.println(message);
	}
	private static void displayPets (VirtualPetShelter s) {
		for (VirtualPet currentPet : s.pets()) {
			System.out.println(currentPet);
		}
		
		

	}

}
