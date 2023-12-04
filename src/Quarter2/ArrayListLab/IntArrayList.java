package Quarter2.ArrayListLab;

public class IntArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity() {
        myCapacity *= 2;
        int[] tempArray = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv++) tempArray[lcv] = myArray[lcv];
        myArray = tempArray;
    }

    private void halfCapacity() {
        myCapacity /= 2;
        int[] tempArray = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv++) tempArray[lcv] = myArray[lcv];
        myArray = tempArray;
    }

    public void add(int num) {
        if (mySize + 1 == myCapacity) doubleCapacity();
        myArray[mySize] = num;
        mySize++;
    }

    public void remove(int index) {
        for (int lcv = index + 1; lcv < mySize; lcv++) myArray[lcv - 1] = myArray[lcv];
        mySize--;
        if (mySize <= myCapacity * 0.25) halfCapacity();
    }

    public int get(int index) { return myArray[index]; }

    public void set(int index, int num) { myArray[index] = num; }

    public int size() { return mySize; }

    public int[] toArray() { return myArray; }

    public int indexOf(int num) {
        for (int lcv = 0; lcv < mySize; lcv++) if (myArray[lcv] == num) return lcv;
        return -1;
    }
}
