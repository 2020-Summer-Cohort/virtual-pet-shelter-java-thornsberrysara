package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VirtualPetShelter {
    public void petsInShelter(String petName, String petValues) {
        Map<String, String> pets = new HashMap<>();
        pets.put("Pokemon", "Jigglypuff");
        pets.put("Pokemon", "Evee");
        pets.put("Pokemon", "Drowzee");

        Collection<String> petNames = pets.values();
        //in app, prompt user to add a pet to shelter and try Collection.add
    }

    public int jigglypuffHunger;
    public int jigglypuffThirst;
    public int jigglypuffBoredom;
    public int eveeHunger;
    public int eveeThirst;
    public int eveeBoredom;
    public int drowzeeHunger;
    public int drowzeeThirst;
    public int drowzeeBoredom;


    void petStatus(){
        System.out.println("Jigglypuff:");
        System.out.println("Hunger: " + jigglypuffHunger);
        System.out.println("Thirst: " + jigglypuffThirst);
        System.out.println("Boredom: " + jigglypuffBoredom);
        System.out.println(" ");
        System.out.println("Evee:");
        System.out.println("Hunger: " + eveeHunger);
        System.out.println("Thirst: " + eveeThirst);
        System.out.println("Boredom: " + eveeBoredom);
        System.out.println(" ");
        System.out.println("Drowzee:");
        System.out.println("Hunger: " + drowzeeHunger);
        System.out.println("Thirst: " + drowzeeThirst);
        System.out.println("Boredom: " + drowzeeBoredom);
        System.out.println(" ");
    }

    Random rand = new Random();
    public VirtualPetShelter() {
        jigglypuffHunger = rand.nextInt(80);
        jigglypuffThirst = rand.nextInt(80);
        jigglypuffBoredom = rand.nextInt(80);
        eveeHunger = rand.nextInt(80);
        eveeThirst = rand.nextInt(80);
        eveeBoredom = rand.nextInt(80);
        drowzeeHunger = rand.nextInt(80);
        drowzeeThirst = rand.nextInt(80);
        drowzeeBoredom = rand.nextInt(80);
    }
    public void feed() {
        jigglypuffHunger = jigglypuffHunger - 15;
        eveeHunger = eveeHunger - 15;
        drowzeeHunger = drowzeeHunger - 15;
    }
    public void drink() {
        jigglypuffThirst = jigglypuffThirst - 10;
        eveeThirst = eveeThirst - 10;
        drowzeeThirst = drowzeeThirst - 10;
    }
    public void playWithJigglypuff() {
        jigglypuffBoredom = jigglypuffBoredom - 25;
    }
    public void playWithEvee() {
        eveeBoredom = eveeBoredom - 25;
    }
    public void playWithDrowzee() {
        drowzeeBoredom = drowzeeBoredom - 25;
    }
    public void tick() {
        jigglypuffHunger = jigglypuffHunger + 3;
        eveeHunger = eveeHunger + 3;
        drowzeeHunger = drowzeeHunger + 3;
        jigglypuffThirst = jigglypuffThirst + 2;
        eveeThirst = eveeThirst + 2;
        drowzeeThirst = drowzeeThirst + 2;
        jigglypuffBoredom = jigglypuffBoredom + 3;
        eveeBoredom = eveeBoredom + 3;
        drowzeeBoredom = drowzeeBoredom + 3;

    }
}
