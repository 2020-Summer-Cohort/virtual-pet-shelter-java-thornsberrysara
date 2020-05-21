package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pikachu's Pet Shelter! This is the status of your pets:");
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
        virtualPetShelter.petStatus();
        int select;

        do {
            System.out.println(" ");
            System.out.println("What would you like to do?");
            System.out.println("Press [1] to feed pets.");
            System.out.println("Press [2] to give the pets a drink.");
            System.out.println("Press [3] to play with a pet.");
            System.out.println("Press [4] to adopt a pet.");
            System.out.println("Press [5] to admit a pet.");
            System.out.println("Press [0] to go home.");

            select = scanner.nextInt();
            virtualPetShelter.tick();
            virtualPetShelter.petStatus();

        } while (select != 0);
    }
    public void petAction(int select, VirtualPetShelter virtualPetShelter) {
        Scanner scanner = new Scanner(System.in);
        int optionNumber = scanner.nextInt();
        switch (optionNumber) {
            case 1:
                virtualPetShelter.feed();
                System.out.println("MMMM! *pokemon noises*");
                break;
            case 2:
                virtualPetShelter.drink();
                System.out.println("SLURP! *pokemon noises*");
                break;
            case 3:
                String choosePetToPlay = scanner.nextLine();
                System.out.println("Who would you like to play with?");
                System.out.println("Press [j] for Jigglypuff.");
                System.out.println("Press [e] for Evee.");
                System.out.println("Press [d] for Drowzee.");
                    switch (choosePetToPlay) {
                        case "j":
                            virtualPetShelter.playWithJigglypuff();
                            System.out.println("*happy pokemon noises*");
                            break;
                        case "e":
                            virtualPetShelter.playWithEvee();
                            System.out.println("*happy pokemon noises*");
                            break;
                        case "d":
                            virtualPetShelter.playWithDrowzee();
                            System.out.println("*happy pokemon noises*");
                            break;
                    }
                break;
        }
    }
}
