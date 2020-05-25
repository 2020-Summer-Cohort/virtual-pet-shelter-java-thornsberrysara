package shelter;

public class VirtualPet {

    private String petName;
    private String petDescription;
    public int hunger;
    public int thirst;
    public int boredom;


    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHunger() {
        return 20;
    }

    public int getThirst() {
        return 15;
    }

    public int getBoredom() {
        return 10;
    }

    public int feedAllPets() {
        hunger = hunger - 20;
        return hunger;
    }

    public int waterAllPets() {
        thirst = thirst - 15;
        return thirst;
    }

    public int playWithPet() {
        boredom = boredom - 10;
        return boredom;
    }

    public void tick() {
        hunger = hunger + 4;
        thirst = thirst + 5;
        boredom = boredom + 3;
    }
}