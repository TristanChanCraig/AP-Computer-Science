package Quarter4.VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        // : Implement feeding behavior for Dog
        super.setEnergy(super.getEnergy() + 2);
        super.setHappiness(super.getHappiness() + 2);
        super.setHunger(super.getHunger() - 1);

        if (super.getEnergy() < 0) super.setEnergy(0);
        else if (super.getEnergy() > 100) super.setEnergy(100);
        if (super.getHappiness() < 0) super.setHappiness(0);
        else if (super.getHappiness() > 100) super.setHappiness(100);
        if (super.getHunger() < 0) super.setHunger(0);
        else if (super.getHappiness() > 100) super.setHappiness(100);
    }

    @Override
    public void play() {
        // : Implement playing behavior for Dog
        super.setHappiness(super.getHappiness() + 2);
        super.setEnergy(super.getEnergy() + 2);
        super.setHunger(super.getHunger() - 2);

        if (super.getEnergy() < 0) super.setEnergy(0);
        else if (super.getEnergy() > 100) super.setEnergy(100);
        if (super.getHappiness() < 0) super.setHappiness(0);
        else if (super.getHappiness() > 100) super.setHappiness(100);
        if (super.getHunger() < 0) super.setHunger(0);
        else if (super.getHappiness() > 100) super.setHappiness(100);
    }

    @Override
    public void sleep() {
        // : Implement sleeping behavior for Dog
        super.setEnergy(super.getEnergy() + 3);
        super.setHunger(super.getHunger() - 1);
        super.setHappiness(super.getHappiness() + 2);

        if (super.getEnergy() < 0) super.setEnergy(0);
        else if (super.getEnergy() > 100) super.setEnergy(100);
        if (super.getHappiness() < 0) super.setHappiness(0);
        else if (super.getHappiness() > 100) super.setHappiness(100);
        if (super.getHunger() < 0) super.setHunger(0);
        else if (super.getHappiness() > 100) super.setHappiness(100);
    }
}
