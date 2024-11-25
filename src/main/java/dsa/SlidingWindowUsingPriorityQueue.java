package dsa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowUsingPriorityQueue {
    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 7, 5, 9, 3, 5, 7, 9};
        int n = ar.length;
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            pq.add(ar[i]);
        }
        res.add(pq.peek());
        pq.remove(ar[0]);

        for (int i = k; i < n; i++) {
            pq.add(ar[i]);
            res.add(pq.peek());
            pq.remove(ar[i - 2]);
        }
        System.out.println(res);
    }
}
