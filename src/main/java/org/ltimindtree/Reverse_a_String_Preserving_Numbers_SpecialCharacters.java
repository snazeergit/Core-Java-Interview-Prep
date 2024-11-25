package org.ltimindtree;

public class Reverse_a_String_Preserving_Numbers_SpecialCharacters {
    public static void main(String[] args) {
        String str = "N@z^^RB@57A";
        //output: A@B^^Rz@57N
        char[] chArray = str.toCharArray();

        //two pointers
        int left = 0, right = chArray.length - 1;
        while (left < right) {
            if (!Character.isLetter(chArray[left]))
                left++;
            else if (!Character.isLetter(chArray[right]))
                right--;
            else {
                char temp = chArray[left];
                chArray[left] = chArray[right];
                chArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(chArray));
    }
}
