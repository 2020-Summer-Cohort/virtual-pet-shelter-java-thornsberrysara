package shelter;

import java.util.HashMap;

public class VirtualPetShelter {

    public HashMap<String, VirtualPet> list = new HashMap<>();

    int hunger;
    int thirst;
    int boredom;

    public VirtualPetShelter(String jigglypuff) {
    }

    public VirtualPetShelter() {

    }

    public void addPet(VirtualPetShelter underTestPokemon) {
    }

    public int getLength() {
        return list.size();
    }

    public void feedPets() {
    }

    public int getHunger() {
        return hunger + 15;
    }

    public void waterPets() {
    }

    public int getThirst() {
        return thirst + 10;
    }

    public void playWithJigglypuff() {
    }

    public int getBoredom() {
        return boredom + 30;
    }
}
