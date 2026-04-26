import java.util.*;
public class MaxAreaHistogram {

    public static void maxAreaHistogram(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length]; //Next Smaller Right
        int nsl[] = new int[arr.length]; //Next Smaller Left

        // Next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Curr area : width = j - i - 1 = nsr[i] - nsl[i] - 1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Largest Rectangle in the Histogram is: "+maxArea);

    }
    public static void main(String[] args) {
        
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights of histogram
        // int arr2[] = {2, 4};

        maxAreaHistogram(arr);
    }
}
