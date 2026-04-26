import java.util.HashMap;
public class largestSubArr_0_Sum {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, idx)
        int sum = 0;
        int maxLength = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println(maxLength);
    }
}
