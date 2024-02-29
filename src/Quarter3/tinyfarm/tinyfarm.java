package Quarter3.tinyfarm;

import java.util.ArrayList;

public class tinyfarm {
    public static void main(String[] args) {
        ArrayList<husky> huskies = new ArrayList<>();
        huskies.add(new husky("Zelda", 69420));
        huskies.add(new husky("Link", 9999));
        farm_but_it_is_jonah_house hi = new farm_but_it_is_jonah_house(huskies);
        hi.printAllHuskies();
        hi.printTotAge();
        huskies.get(1).woof();
        huskies.get(0).sleep();

    }
}
