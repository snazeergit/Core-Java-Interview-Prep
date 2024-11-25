package org.ltimindtree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_Repeated_words_In_a_String {
    public static void main(String[] args) {
        String str = "Hi hello how are   you hello HI ARe     you         okay";
        //String have single white spaces, Tab spaces

        //approach-1
        Map<String, Integer> map = new HashMap<>();
        for (String word : str.toLowerCase().split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        Map<String, Integer> map1 = map.entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        map1.forEach((k, v) -> {
            System.out.println(k + " has repeated " + v + " times");
        });

        //approach:2
        String[] words = str.toLowerCase().split("\\s+");
        Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)).forEach((k,v)->{
            System.out.println(k+ " has repeated "+v+" times");
        });
    }
}
