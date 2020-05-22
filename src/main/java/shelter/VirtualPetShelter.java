package shelter;

import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

    public HashMap<String, VirtualPet> list = new HashMap<>();

    int hunger;
    int thirst;
    int boredom;

    public VirtualPetShelter() {
    }

    public VirtualPetShelter(String jigglypuff) {
    }

    public Collection<VirtualPet> getPets() {
        return list.values();
    }

    public void addPet(VirtualPetShelter underTestPokemon) {
    }

    public void removePet(VirtualPetShelter underTestPokemon) {
    }

    public void feedPets() {
    }

    public void waterPets() {
    }

    public void playWithJigglypuff() {
    }

    public void playWithEvee() {
    }

    public void playWithDrowzee() {
    }

    public int getHunger() {
        return hunger + 15;
    }

    public int getThirst() {
        return thirst + 10;
    }

    public int getBoredom() {
        return boredom + 30;
    }

    public int getLength() {
        return list.size();
    }

    public void tick() {
    }
}
