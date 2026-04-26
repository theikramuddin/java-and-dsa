import java.util.*;
public class NextGreater {

    public static void nextGreater(int[] arr, int[] nG) {

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            //1 while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2 if-else loop
            if (s.isEmpty()) {
                nG[i] = -1;
            } else {
                nG[i] = arr[s.peek()];
            }

            //3 push in stack
            s.push(i);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {6, 8, 0, 1, 3};
        int nG[] = new int[arr.length];

        nextGreater(arr, nG);

        for (int i = 0; i < nG.length; i++) {
            System.out.print(nG[i]+ " ");
        }
    }
}
