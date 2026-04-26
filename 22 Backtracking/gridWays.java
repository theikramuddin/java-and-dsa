public class gridWays {

    public static int gridWay(int i, int j, int n, int m) {

        // Base case
        if (i == n-1 && j == m-1) { // Condition for last cell
            return 1;
        } else if (i == n || j == n) { // Boundry cross condition
            return 0;
        }
        int w1 = gridWay(i+1, j, n, m);
        int w2 = gridWay(i, j+1, n, m);

        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3, m=3;

        System.out.println(gridWay( 0, 0, n, m));
    }
}
