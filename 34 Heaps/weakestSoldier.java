import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class weakestSoldier {
    static class Row implements Comparable<Row> {
        int sol;
        int idx;

        public Row(int sol, int idx) {
            this.sol = sol;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.sol == r2.sol) {
                return this.idx - r2.idx;
            } else {
                return this.sol - r2.sol;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};
        int k=2;
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0; i<army.length; i++) {
            int count = 0;
            for(int j=0; j<army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }

            pq.add(new Row(count, i));
        }

        for(int i=0; i<k; i++) {
            System.out.println("R"+pq.remove().idx);
        }
    }
}