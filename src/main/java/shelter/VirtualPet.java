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
        this.hunger = 20;
        this.thirst = 15;
        this.boredom = 10;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int feed() {
        hunger = hunger - 20;
        return hunger;
    }

    public int water() {
        thirst = thirst - 15;
        return thirst;
    }

    public int play() {
        boredom = boredom - 10;
        return boredom;
    }

    public void tick() {
        hunger = hunger + 4;
        thirst = thirst + 5;
        boredom = boredom + 3;
    }
}