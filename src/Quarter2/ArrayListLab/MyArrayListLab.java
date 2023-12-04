package Quarter2.ArrayListLab;

public class MyArrayListLab {
    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();

        System.out.println("Testing add() and get()...");
        for (int i = 0; i < 10; i++)
            list.add(i);

        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));

        System.out.println("\nTesting set()...");
        for (int i = 0; i < list.size(); i++)
            list.set(i, i * 2);

        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));

        System.out.println("\nTesting remove()...");
        for (int i = 0; i < list.size(); i++)
            if (i % 3 == 0) list.remove(i);

        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));

        System.out.println("\nTesting indexOf()...");
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 20);
            System.out.println("list.indexOf(" + num + ") = " + list.indexOf(num));
        }
    }
}
/*
Testing add() and get()...
list.get(0) = 0
list.get(1) = 1
list.get(2) = 2
list.get(3) = 3
list.get(4) = 4
list.get(5) = 5
list.get(6) = 6
list.get(7) = 7
list.get(8) = 8
list.get(9) = 9

Testing set()...
list.get(0) = 0
list.get(1) = 2
list.get(2) = 4
list.get(3) = 6
list.get(4) = 8
list.get(5) = 10
list.get(6) = 12
list.get(7) = 14
list.get(8) = 16
list.get(9) = 18

Testing remove()...
list.get(0) = 2
list.get(1) = 4
list.get(2) = 6
list.get(3) = 10
list.get(4) = 12
list.get(5) = 14
list.get(6) = 18

Testing indexOf()...
list.indexOf(10) = 3
list.indexOf(9) = -1
list.indexOf(1) = -1
list.indexOf(3) = -1
list.indexOf(9) = -1
list.indexOf(18) = 6
list.indexOf(2) = 0
list.indexOf(14) = 5
list.indexOf(16) = -1
list.indexOf(11) = -1
 */