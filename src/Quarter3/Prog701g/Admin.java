package Quarter3.Prog701g;

import java.security.KeyStore;

public class Admin extends Person {
    private String myFavw;
    // Inherited myFirst and myLast from Person

    public Admin(String fn, String ln, String fav) {
        super(fn, ln); // Call constructor of super/parent class
        myFavw = fav;
    }

    public String getFavw() { return myFavw;  }
}
