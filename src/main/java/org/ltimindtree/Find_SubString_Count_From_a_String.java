package org.ltimindtree;

import java.util.ArrayList;
import java.util.List;

public class Find_SubString_Count_From_a_String {
    public static void main(String[] args) {
        String[] ar={"a", "ab","abc","d","c","cd"};
        String str="abc";
        int count1=0;
        List<String> list1=new ArrayList<>();
        for(String s: ar){
            if(str.indexOf(s)!=-1){
                count1++;
                list1.add(s);
            }
        }
        System.out.println("Total substring count :"+count1);
        System.out.println("Substring of "+str+" : "+list1);

        //contains(-)
        int count2=0;
        List<String> list2=new ArrayList<>();
        for(String s: ar){
            if(str.contains(s)){
                count2++;
                list2.add(s);
            }
        }
        System.out.println("Total substring count :"+count2);
        System.out.println("Substring of "+str+" : "+list2);
    }
}
