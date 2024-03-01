package Quarter3.tinyfarm;

import java.util.ArrayList;

public class farm_but_it_is_jonah_house {
    private ArrayList<husky> myHuskies = new ArrayList<>();

    public farm_but_it_is_jonah_house(ArrayList<husky> huskies) {
        for (husky h : huskies) myHuskies.add(h);
    }

    private int getTotAge() {
        int totAge = 0;
        for (int lcv = 0; lcv < myHuskies.size(); lcv++) {
            totAge += myHuskies.get(lcv).getAge();
        }
        return totAge;
    }

    public void printTotAge() {
        System.out.println("Age: " + getTotAge());
    }

    public void printAllHuskies() {
        for (int lcv = 0; lcv < myHuskies.size(); lcv++) {
            System.out.println(myHuskies.get(lcv).getName() + " " + myHuskies.get(lcv).getAge());
        }
    }
}
