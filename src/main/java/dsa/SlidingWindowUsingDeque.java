package dsa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowUsingDeque {
    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 7, 5, 9, 3, 5, 7, 9};
        int n = ar.length;
        int k = 3;

        Deque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty()&&ar[i]>=ar[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res.add(ar[dq.peek()]);

        for (int i = k; i < n; i++) {
            while (!dq.isEmpty()&&dq.peek()<i-2){
                dq.removeFirst();
            }

            while (!dq.isEmpty()&&ar[i]>=ar[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            res.add(ar[dq.peek()]);
        }
        System.out.println(res);
    }
}

