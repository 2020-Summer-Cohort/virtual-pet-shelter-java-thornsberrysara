package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    @Test
    public void addPetToShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("Jigglypuff", "A super cute fairy");
        underTest.addPetToShelter(pet);
    }

    @Test
    public void removePetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("Jigglypuff", "A super cute fairy");
        underTest.removePetFromShelter(pet);
    }

    @Test
    public void shouldFeedAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Jigglypuff", "A super cute fairy");
        VirtualPet pet2 = new VirtualPet("Eevee", "A fierce and powerful Pokemon");
        underTest.addPetToShelter(pet1);
        underTest.addPetToShelter(pet2);
        assertEquals(20, pet1.getHunger());
        assertEquals(20, pet2.getHunger());
        underTest.feedAllPets();
        assertEquals(0, pet1.getHunger());
        assertEquals(0, pet2.getHunger());
    }

    @Test
    public void shouldWaterAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Jigglypuff", "A super cute fairy");
        VirtualPet pet2 = new VirtualPet("Eevee", "A fierce and powerful Pokemon");
        underTest.addPetToShelter(pet1);
        underTest.addPetToShelter(pet2);
        assertEquals(15, pet1.getThirst());
        assertEquals(15, pet2.getThirst());
        underTest.waterAllPets();
        assertEquals(0, pet1.getThirst());
        assertEquals(0, pet2.getThirst());
    }

    @Test
    public void playWithAPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Jigglypuff", "A super cute fairy");
        VirtualPet pet2 = new VirtualPet("Eevee", "A fierce and powerful Pokemon");
        underTest.addPetToShelter(pet1);
        underTest.addPetToShelter(pet2);
        underTest.playWithPet("Jigglypuff");
    }

    @Test
    public void shouldTickAll() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Jigglypuff", "A super vute fairy");
        VirtualPet pet2 = new VirtualPet("Eevee", "A fierce and powerful Pokemon");
        underTest.addPetToShelter(pet1);
        underTest.addPetToShelter(pet2);
        assertEquals(20, pet1.getHunger());
        assertEquals(20, pet2.getHunger());
        assertEquals(15, pet1.getThirst());
        assertEquals(15, pet2.getThirst());
        underTest.tick();
        assertEquals(24, pet1.getHunger());
        assertEquals(24, pet2.getHunger());
        assertEquals(20, pet1.getThirst());
        assertEquals(20, pet2.getThirst());
    }
}
