package Quarter4.VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
    }
}
