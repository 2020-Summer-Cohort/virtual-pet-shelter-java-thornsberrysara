package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void addPetToShelter() {
        VirtualPet underTest = new VirtualPet("Jigglypuff", "Fairy");
    }

    @Test
    public void shouldBeAbleToNameAndDescribePet() {
        VirtualPet underTest = new VirtualPet("Jigglypuff", "Fairy");
        String petName = underTest.getPetName();
        assertEquals(petName, "Jigglypuff");
        String petDescription = underTest.getPetDescription();
        assertEquals(petDescription, "Fairy");
    }

    @Test
    public void shouldAcceptValues() {
        VirtualPet underTestHunger = new VirtualPet("Jigglypuff", "Fairy");
        int petHunger = underTestHunger.getHunger();
        assertEquals(0, underTestHunger.getHunger());

        VirtualPet underTestThirst = new VirtualPet("Jigglypuff", "Fairy");
        int petThirst = underTestThirst.getThirst();
        assertEquals(0, underTestThirst.getThirst());

        VirtualPet underTestBoredom = new VirtualPet("Jigglypuff", "Fairy");
        int petBoredom = underTestBoredom.getBoredom();
        assertEquals(0, underTestBoredom.getBoredom());

    }
}

