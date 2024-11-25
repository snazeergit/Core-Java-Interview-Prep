package dsa;

public class StringReverse {
    public static void main(String[] args) {
        String in = "ABC123PQ!@#XYZ";
        char[] ar = in.toCharArray();
        int n = ar.length;

        int left = 0, right = n - 1;
        while (left < right) {
            if (!Character.isAlphabetic(ar[left])) {
                left++;
            } else if (!Character.isAlphabetic(ar[right])) {
                right--;
            } else {
                char temp = ar[left];
                ar[left] = ar[right];
                ar[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ar));
    }
}
