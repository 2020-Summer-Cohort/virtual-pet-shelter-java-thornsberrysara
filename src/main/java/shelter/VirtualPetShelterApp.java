package shelter;

import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet pet1 = new VirtualPet("Jigglypuff", "A super cute fairy");
        VirtualPet pet2 = new VirtualPet("Eevee", "A fierce and powerful Pokemon");
        VirtualPet pet3 = new VirtualPet("Drowzee", "A very sleepy big boy");
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.addPetToShelter(pet1);
        petShelter.addPetToShelter(pet2);
        petShelter.addPetToShelter(pet3);
        System.out.println("Thank you for volunteering at Pikachu's Shelter!");

        int select;

        do {
            System.out.println("Please view the status of your pets. We want to keep all of their needs as low as possible.");
            System.out.println("Name" + "\t\t" + "Hunger" + "\t" + "Thirst" + "\t" + "Boredom");
            Map<String, VirtualPet> petMap = petShelter.getVirtualPetMap();
            for (VirtualPet virtualPet: petMap.values()) {
                System.out.println(virtualPet.getPetName() + "\t\t" + virtualPet.getHunger() + "\t\t" + virtualPet.getThirst() + "\t\t" + virtualPet.getBoredom() + "\t");
            }
            System.out.println("\n What would you like to do?");
            System.out.println("Press [1] to feed all pets.");
            System.out.println("Press [2] to hydrate all pets.");
            System.out.println("Press [3] to play with a pet.");
            System.out.println("Press [4] to admit a pet.");
            System.out.println("Press [5] to adopt a pet.");
            System.out.println("Press [0] to leave.");

            select = input.nextInt();
            petShelter.tick();
            petAction(select, petShelter);

        } while (select != 0);
    }
    public static void petAction(int select, VirtualPetShelter petShelter) {
        Scanner input = new Scanner(System.in);
        if (select == 1) {
            petShelter.feedAllPets();
            System.out.println("MMMM! *pokemon noises* \n");
        } else if (select == 2) {
            petShelter.waterAllPets();
            System.out.println("SLURP! *pokemon noises* \n");
        } else if (select == 3) {
            System.out.println("Who would you like to play with?");
            System.out.println(petShelter.getPetCollection());
            String petChoice = input.nextLine();
            petShelter.playWithPet(petChoice);
            System.out.println(petChoice + ": hehehe! That tickles!\n");
        } else if (select == 4) {
            System.out.println("Sure, we have room for another pet. Please give this pet a name.");
            String addPetName = input.nextLine();
            System.out.println("Please give a short description of " + addPetName);
            String addPetDescription = input.nextLine();
            VirtualPet addPet = new VirtualPet(addPetName, addPetDescription);
            petShelter.addPetToShelter(addPet);
        } else if (select == 5) {
            System.out.println("We would love to give a pet a loving new home! Who would you like to adopt?");
            String petChoice = input.nextLine();
            petShelter.removePetFromShelter(petShelter.returnPetFromName(petChoice));
            System.out.println("Good luck at your new home, " + petChoice + "!");
        } else if (select == 0) {
            System.out.println("You're leaving already? See you soon!");
        }
    }
}