package org.ltimindtree;


import java.util.*;
import java.util.stream.Stream;

public class Find_Distinct_Array {
    public static void main(String[] args) {
        int[] ar={9,4,2,5,6,7,3,8,1,6};
        //1 HashSet
        Set<Integer> set1=new HashSet<>();
        for(int i: ar){
            set1.add(i);
        }
        System.out.println(set1);

        //2 LinkedHashSet
        Set<Integer> set2=new LinkedHashSet<>();
        for(int i: ar){
            set2.add(i);
        }
        System.out.println(set2);

        //3 HashMap
        Map<Integer, Integer> map1=new HashMap<>();
        for(int i: ar){
            map1.put(i ,map1.getOrDefault(i,0)+1);
        }
        Object[] array1 = map1.entrySet().stream().map(Map.Entry::getKey).toArray();
        System.out.println(Arrays.toString(array1));

        //4 LinkedHashMap
        Map<Integer, Integer> map2=new LinkedHashMap<>();
        for(int i: ar){
            map2.put(i, map2.getOrDefault(i,0)+1);
        }
        Object[] array2 = map2.entrySet().stream().map(Map.Entry::getKey).toArray();
        System.out.println(Arrays.toString(array2));

        // Streams Java8
        int[] array3 = Arrays.stream(ar).distinct().toArray();
        System.out.println(Arrays.toString(array3));

        // Without using Collections and Stream API
        int counter=0;
        int[] temp=new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            boolean isDistinct=true;
            for (int j = 0; j < i; j++) {
                if(ar[i]==ar[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct){
                temp[counter++]=ar[i];
            }
        }
        int[] array4 = Arrays.copyOf(temp, counter);
        System.out.println(Arrays.toString(array4));
    }
}
