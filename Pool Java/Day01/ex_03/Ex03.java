import java.util.ArrayList;

public class Ex03 {
    // public static void main(String[] args) {
    //     ArrayList<String> aList = new ArrayList<String>();
    //     aList.add("Apple");
    //     aList.add("Mango");
    //     aList.add("Guava");
    //     aList.add("Orange");
    //     aList.add("Peach");

    //     Ex03.printArray(aList);
    // }

    public static void printArray(ArrayList<String> myArray) {
        for(int i=0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }
    }
}
