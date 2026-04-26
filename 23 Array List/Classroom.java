import java.util.ArrayList;
// import java.util.Collections;

public class Classroom {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 =  new ArrayList<>();
        // ArrayList<Boolean> list3 =  new ArrayList<>();

        // Add Elements O(1)
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(6);
        // list.add(8);
        // System.out.println(list);

        // Get Element O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // Remove Element O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set Element O(n)
        // list.set(1, 10);
        // System.out.println(list);

        // Contain Element O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // Print Size
        // System.out.println(list.size());

        // Print the ArrayList
        // for(int i=0; i<list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // Print the ArrayList in Reverse O(n)
        // for(int i=list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }

        //  Find the Maximum Element in the ArrayList O(n)
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++) {
            // if(list.get(i) > max) {
            //     max = list.get(i);
            // }

            // max = Math.max(max, list.get(i));
        // }
        // System.out.println("Maximum element is: " + max);

        // Swap two numbers
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list );
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // Sorting the ArrayList
        // Collections.sort(list);
        // System.out.println(list);

        // Descending Order
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
        // Comparator - fnx logic (Comparator is a function to defined sorting of the logic).

        // Multi-Dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1); list1.add(2); list1.add(3);
        // mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(2); list2.add(4); list2.add(6);
        // mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(3); list3.add(6); list3.add(9);
        // mainList.add(list3);

        // for(int i=0; i<mainList.size(); i++) {
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++) {
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);


    }
}