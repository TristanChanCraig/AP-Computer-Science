package Quarter2;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        // ArrayList<WrapperType>

        for (int lcv = 0; lcv < 100; lcv++) {
            int rand = (int)(Math.random() * 100 ) + 1;
            list.add(rand);
        }

        for (int lcv = 0; lcv < list.size(); lcv += 2)
            System.out.print(list.get(lcv) + " ");
        System.out.println();

        System.out.println("Does list contain 50? " + list.contains(50));
        System.out.println("Index of 50: " + list.indexOf(50));

        list.add(2, 999);
        list.set(0, 123);

        for (int num : list) System.out.println(num);
    }
}
