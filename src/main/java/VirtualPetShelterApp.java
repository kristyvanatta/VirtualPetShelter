import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter Shelter = new VirtualPetShelter();
		
		boolean quit = false;
		VirtualPet sweetie = new VirtualPet ("Sweetie", "is a timid sole that loves to cuddle", 50, 50, 50, 50);
		Shelter.intake(sweetie);
		VirtualPet pongo = new VirtualPet ("Pongo", "is a hyperactive puppy", 50, 50, 50, 50);
		Shelter.intake(pongo);
		VirtualPet lacy = new VirtualPet ("Lacy", "is a fat cat", 50, 50, 50, 50);
		Shelter.intake(lacy);
		
		do {
			writeLine("\nThank you for volunteering at Happy Pets Animal Shelter!");
			writeLine("\nHere is the status report for the pets:");
			writeLine("Name\t|tHunger \t|Thirst  \t|Boredom \t|Cleanliness");
			writeLine("--------|--------|--------|--------|--------");
			
			for (VirtualPet currentPet:Shelter.pets()) {
				writeLine(currentPet.name + "\t|" + currentPet.hunger + "\t|" + currentPet.thirst + "\t|" + currentPet.boredom + "\t|" + currentPet.claenliness);
			}
			writeLine("What would you like to do next?");
			writeLine("1. Feed the pets \n2. Water the pets \n3. Play with a pet \4. Adopt a pet \5. Admit a pet \6. Clean pets");
			String response = input.nextLine();
			
			switch (response) {
			case "1"://feed pets
				Shelter.feedPets();
				writeLine("Thank you, the pets were hungry!");
				break;
				
			case "2"://water pets
				Shelter.waterPets();
				writeLine("Oh boy!, they sure did drink a lot!");
				break;
				
			case "3"://play with a pet
				writeLine("The pets look bored. Would you like to chose one to play with?\n");
				displayPets(Shelter);
				writeLine("\nWho would you like to choose?");
				String petName = input.nextLine();
				Shelter.playWith(petName);
				writeLine("You chose" + petName + "to play.");
				break;
				
			case "4"://adoption
				writeLine("You would like to adopt a pet. Fantastic!These pets are available:\n");
				displayPets(Shelter);
				writeLine("\nWho would you like to choose?");
				String nameToAdopt = input.nextLine();
				VirtualPet x = Shelter.getPet(nameToAdopt);
				Shelter.adopt(x);
				writeLine("You adopted" + nameToAdopt + "I know you will take good care of your new pet");
				break;
				
			case "5"://drop off a pet
				writeLine("Please enter the new pets name:");
				String name = input.nextLine();
				writeLine("Please describe the pet:");
				String description = input.nextLine();
				VirtualPet p = new VirtualPet(name, description);
				Shelter.intake(p);
				writeLine("Thank you for bringing in " + p.getName() + "! We will take good care of this new pet");
				break;
				
			case "6"://cleaning
				writeLine("Oh no! Looks like the pets made a mess. Chose a pet to clean:");
				displayPets(Shelter);
				writeLine("Who would you like to help clean?");
				String cageName = input.nextLine();
				Shelter.cleanCage(cageName);
				writeLine("Thank you for cleaning" + cageName + "They sure did make a mess!");
				break;
				
			case "7": // do nothing
				break;
				
			case "8": //leave the shelter
				writeLine("Thank you for helping out today, see you next time!");
				System.exit(0);
				
			default:
				writeLine("I'm sorry, I didn't understand you. Please select again");
				break;
			
			}
			Shelter.tick();
			
		}while(!quit);
		input.close();
					
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
