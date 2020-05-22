package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void addPetToShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPetShelter underTestPokemon = new VirtualPetShelter("Jigglypuff");
        underTest.addPet(underTestPokemon);
    }

    @Test
    public void removePetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPetShelter underTestPokemon = new VirtualPetShelter("Jigglypuff");
        underTest.removePet(underTestPokemon);
    }

    @Test
    public void returnPetsInShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPetShelter underTestPokemon = new VirtualPetShelter("Jigglypuff");
        int size = underTest.getLength();
        assertEquals(0, size);
    }

    @Test
    public void shouldFeedPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPetShelter underTestPokemon = new VirtualPetShelter("Jigglypuff");
        VirtualPetShelter underTestPokemon2 = new VirtualPetShelter("Evee");
        underTest.addPet(underTestPokemon);
        underTest.addPet(underTestPokemon2);
        underTest.feedPets();
        assertEquals(15, underTestPokemon.getHunger());
        assertEquals(15, underTestPokemon2.getHunger());
    }

    @Test
    public void shouldWaterPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPetShelter underTestPokemon = new VirtualPetShelter("Jigglypuff");
        VirtualPetShelter underTestPokemon2 = new VirtualPetShelter("Evee");
        underTest.addPet(underTestPokemon);
        underTest.addPet(underTestPokemon2);
        underTest.waterPets();
        assertEquals(10, underTestPokemon.getThirst());
        assertEquals(10, underTestPokemon2.getThirst());
    }

    @Test
    public void shouldPlayWithJigglypuff() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPetShelter underTestPokemon = new VirtualPetShelter("Jigglypuff");
        underTest.addPet(underTestPokemon);
        underTest.playWithJigglypuff();
        assertEquals(30, underTestPokemon.getBoredom());
    }

    @Test
    public void shouldTickAttributes() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPetShelter underTestPokemon = new VirtualPetShelter("Jigglypuff");
        VirtualPetShelter underTestPokemon2 = new VirtualPetShelter("Evee");
        underTest.addPet(underTestPokemon);
        underTest.addPet(underTestPokemon2);
        underTest.tick();
        assertEquals(15, underTestPokemon.getHunger());
        assertEquals(15, underTestPokemon2.getHunger());
    }
}
