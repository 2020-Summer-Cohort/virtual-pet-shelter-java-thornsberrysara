package shelter;

public class VirtualPet {
    public String petName;
    public String petDescription;
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
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }
}