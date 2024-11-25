package com.vmware.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class NumberSorting {
    public static void main(String[] args) {
        System.out.println("1. Sorting Primitive Arrays : ");
        int[] numbers = {2, 4, 1, 4, 2, 3, 5};
        //ascending
        int[] array = Arrays.stream(numbers)
                .sorted()
                .toArray();
        System.out.println("ASC: " + Arrays.toString(array));
        /*
          For primitive types (e.g., int[]), you can’t directly use Comparator.reverseOrder()
          because primitives do not implement Comparable.
        */
        //descending
        int[] array1 = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("DESC: " + Arrays.toString(array1));


        System.out.println("2. Sorting Wrapper class Arrays : ");
        Integer[] nums = {2, 4, 1, 4, 2, 3, 5};
        //Ascending
        Integer[] array2 = Arrays.stream(nums).sorted().toArray(Integer[]::new);
        System.out.println("ASC: " + Arrays.toString(array2));
        //Descending
        Integer[] array3 = Arrays.stream(nums).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        System.out.println("DESC: " + Arrays.toString(array3));


        System.out.println("3.1 Sorting List<Integer> collection:");
        List<Integer> list = Arrays.asList(nums);
        //Ascending
        List<Integer> list1 = list.stream().sorted().toList();
        System.out.println("ASC: " + list1);
        //Descending
        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("DESC :" + list2);


        System.out.println("3.2 Sorting Set<Integer> collection:");
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        //Ascending
        Set<Integer> set1 = set.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("ASC: " + set1);
        //Descending
        Set<Integer> set2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("DESC :" + set2);
        System.out.println("Caution: Set only allows unique elements and doesn't guaranteed the insertion order");
        System.out.println("hence we are mapping sorted elements to LinkedHashSet which preserves insertion order.");

        System.out.println("3.3 Sorting List<Object> collection:");
        List<Employee> employees = Arrays.asList(
                new Employee("George", 10, 10000),
                new Employee("Robert", 12, 15000),
                new Employee("Kathy", 24, 25000)
        );
        //Ascending
        //employees.stream().sorted().toList(); //throws java.lang.ClassCastException because Comparable is not implemented by Employee
        List<Employee> list3 = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        System.out.println("ASC: " + list3);

        //employees.stream().sorted(Comparator.reverseOrder()).toList(); //throws java.lang.ClassCastException because Comparable is not implemented by Employee
        /*
        will not work as intended because Comparator.reverseOrder() by itself is for natural ordering in reverse
        and is not suitable for complex objects like Employee unless the Employee class implements the Comparable interface.
        Issue:
        •	Comparator.reverseOrder():
            •	Works only with elements that implement the Comparable interface (e.g., String, Integer).
            •	If Employee doesn’t implement Comparable, this code will throw a ClassCastException.
        Correct Approach:
        If you want to sort the employees in descending order based on a specific property, like name, you need to
        use Comparator.comparing() with .reversed().
        */

        //Descending
        List<Employee> list4 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();
        System.out.println("DESC: " + list4);


        System.out.println("3.4 Sorting Map<String, Integer> collection:");
        Map<String,Integer> map=new HashMap<>();
        map.put("Sachin", 42);
        map.put("Virat", 36);
        map.put("Uvaraj", 40);
        map.put("Raina", 36);
        map.put("Dhawan", 37);
        map.put("Dhoni", 40);

        //Ascending
        LinkedHashMap<String, Integer> map1 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors
                            .toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldVal, newVal) -> oldVal,
                                LinkedHashMap::new
                            )
                    );
        System.out.println("ASC: " + map1);
        //Descending
       Map<String,Integer> map2=map.entrySet().stream()
               .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                       .collect(Collectors
                               .toMap(
                                   Map.Entry::getKey,
                                   Map.Entry::getValue,
                                   (oldVal, newVal)->oldVal,
                                   LinkedHashMap::new
                               )
                       );
        System.out.println("DESC :" + map2);

    }
}
