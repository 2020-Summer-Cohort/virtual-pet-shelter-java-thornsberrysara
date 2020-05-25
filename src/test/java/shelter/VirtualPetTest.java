package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldBeAbleToNameAndDescribePet() {
        VirtualPet underTest = new VirtualPet("Jigglypuff", "A super cute fairy");
        String petName = underTest.getPetName();
        assertEquals("Jigglypuff", petName);
        String petDescription = underTest.getPetDescription();
        assertEquals("A super cute fairy", petDescription);
    }

    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Jigglypuff", "A super cute fairy");
        int hunger = underTest.getHunger();
        assertEquals(20, hunger);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Jigglypuff", "A super cute fairy");
        int thirst = underTest.getThirst();
        assertEquals(15, thirst);
    }

    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("Jigglypuff", "A super cute fairy");
        int boredom = underTest.getBoredom();
        assertEquals(10, boredom);
    }

}

