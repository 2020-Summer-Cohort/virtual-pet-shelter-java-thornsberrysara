package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public Map<String, VirtualPet> virtualPetMap = new HashMap<>();
    public Map<String, VirtualPet> getVirtualPetMap() {
        return virtualPetMap;
    }
    public Collection getPetCollection() {
        return virtualPetMap.keySet();
    }
    public VirtualPet returnPetFromName(String petName) {
        return virtualPetMap.get(petName);
    }
    public void addPetToShelter(VirtualPet pet) {
        virtualPetMap.put(pet.getPetName(), pet);
    }
    public void removePetFromShelter(VirtualPet pet) {
        virtualPetMap.remove(pet.getPetName(), pet);
    }
    public void feedAllPets() {
        for (VirtualPet virtualPets : virtualPetMap.values()) {
            virtualPets.feedAllPets();
        }
    }
    public void waterAllPets() {
        for (VirtualPet virtualPets : virtualPetMap.values()) {
            virtualPets.waterAllPets();
        }
    }

    public void playWithPet(String petName) {
        virtualPetMap.get(petName).playWithPet();
    }

    public void tick() {
        for (VirtualPet virtualPets : virtualPetMap.values()) {
            virtualPets.tick();
        }
    }
}

