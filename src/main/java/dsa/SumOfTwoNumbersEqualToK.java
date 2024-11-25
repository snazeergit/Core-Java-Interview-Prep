package dsa;

public class SumOfTwoNumbersEqualToK {
    public static void main(String[] args) {
        int[] ar = {1, 3, 4, 5, 6, 7, 8};
        int n = ar.length;
        int k = 15;
        //Two pointers
        int left = 0, right = n - 1;
        while (left < right) {
            if (ar[left] + ar[right] == k) {
                System.out.println("Match found:");
                System.out.println(ar[left] + " + " + ar[right] + " = " + (ar[left] + ar[right]));
                return;
            } else if (ar[left] + ar[right] > k) {
                right--;
            } else {
                left++;
            }
        }
    }
}
