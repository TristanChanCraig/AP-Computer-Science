package Quarter4.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Cat
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
    }
}
