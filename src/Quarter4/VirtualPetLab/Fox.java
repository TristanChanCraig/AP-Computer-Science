package Quarter4.VirtualPetLab;

public class Fox extends Pet {

    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomFoxImg());
    }

    @Override
    public void feed() {

    }

    @Override
    public void play() {

    }

    @Override
    public void sleep() {

    }
}
