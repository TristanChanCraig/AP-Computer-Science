package Quarter4.VirtualPetLab;

public abstract class Pet {
    private final String name;
    private String image;  // Base64
    private int hunger;
    private int energy;
    private int happiness;
    public static final int MAX_HUNGER = 100;
    public static final int MAX_ENERGY = 100;
    public static final int MAX_HAPPINESS = 100;

    public Pet(String name) {
        this.name = name;
        this.hunger = 50;    // Midpoint of hunger
        this.energy = 50;    // Midpoint of energy
        this.happiness = 50; // Midpoint of happiness
        this.image = "";
    }

    public String getName()   { return name; }
    public int getHunger()    { return hunger; }
    public int getEnergy()    { return energy; }
    public int getHappiness() { return happiness; }
    public String getImage()  { return image; }

    public void setHunger(int hunger)       { this.hunger = hunger; }
    public void setEnergy(int energy)       { this.energy = energy; }
    public void setHappiness(int happiness) { this.happiness = happiness; }
    public void setImage(String image)      { this.image = image; }

    // Implement in the child classes
    public abstract void feed();
    public abstract void play();
    public abstract void sleep();

    // : Add a public method to return the pet's status as a string
    public String toString() {
        return String.format("Hunger: %d     Energy: %d     Happiness: %d", hunger, energy, happiness);
    }

    // It may also be help to make a public/protected "clampAttributes()" method to ensure that the pet's attributes do
    // not exceed their maximum values or drop below 0 when feeding/playing/sleeping. Call this method using 'super'.
}

