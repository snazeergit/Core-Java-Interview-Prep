package com.vmware.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("George", 10, 10000),
                new Employee("Robert", 12, 15000),
                new Employee("Kathy", 24, 25000)
        );

        //Collections.sort(-,-) passing Comparator as anonymous inner class
        System.out.println("Collections.sort(-,-) passing Comparator as anonymous inner class : ");
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }

        //Collections.sort(-,-) passing Comparator as Lambda expression
        System.out.println("Collections.sort(-,-) passing Comparator as Lambda expression  :");
        Comparator<Employee> c1 = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Collections.sort(employees, c1);
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }

        //Collections.sort(-,-) passing Comparator as Method Reference
        System.out.println("Collections.sort(-,-) passing Comparator with Method Reference :");
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        employees.forEach(emp -> System.out.println(emp.getName()));


        //List.sort(-) passing Comparator as Lambda expression
        System.out.println("List.sort(-) passing Comparator as Lambda expression :");
        employees.sort(c1);
        employees.forEach(emp -> System.out.println(emp.getName()));

        //List.sort(-) passing Comparator with Method Reference
        System.out.println("List.sort(-) passing Comparator with Method Reference :");
        employees.sort(Comparator.comparing(Employee::getName));
        employees.forEach(emp -> System.out.println(emp.getName()));

        //Stream.sorted(-) passing Comparator with Method Reference or Lambda Expression
        System.out.println("Stream.sorted(-) passing Comparator with Method Reference or Lambda Expression :");
        System.out.println("Sorted(Ascending) :");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(emp -> System.out.println(emp.getName()));
        employees.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList()).forEach(emp -> System.out.println(emp.getName()));

        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList()).forEach(emp -> System.out.println(emp.getName()));
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).toList().forEach(emp-> System.out.println(emp.getAge()));

        employees.stream().sorted((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary())).toList().forEach(emp-> System.out.println(emp.getSalary()));
        employees.stream().sorted((e1,e2)-> Integer.compare(e1.getAge(), e2.getAge())).toList().forEach(emp-> System.out.println(emp.getAge()));

        employees.stream().sorted((e1,e2)->Double.valueOf(e1.getSalary()).compareTo(Double.valueOf(e2.getSalary()))).toList().forEach(emp-> System.out.println(emp.getName()));
        employees.stream().sorted((e1,e2)->Integer.valueOf(e1.getAge()).compareTo(Integer.valueOf(e2.getAge()))).toList().forEach(emp-> System.out.println(emp.getAge()));

        System.out.println("Sorted(Descending) :");
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList().forEach(emp -> System.out.println(emp.getName()));

        employees.stream().sorted((e1,e2)->-e1.getName().compareTo(e2.getName())).toList().forEach(emp -> System.out.println(emp.getName()));
        employees.stream().sorted((e1,e2)->e2.getName().compareToIgnoreCase(e1.getName())).toList().forEach(emp -> System.out.println(emp.getName()));
        Comparator<Employee> c2=(e1,e2)->e2.getName().compareToIgnoreCase(e1.getName());
        employees.stream().sorted(c2.reversed()).toList().forEach(emp -> System.out.println(emp.getName()));

        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList().forEach(emp-> System.out.println(emp.getSalary()));
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).toList().forEach(emp-> System.out.println(emp.getAge()));

        employees.stream().sorted((e1,e2)-> Double.compare(e2.getSalary(), e1.getSalary())).toList().forEach(emp-> System.out.println(emp.getSalary()));
        employees.stream().sorted((e1,e2)-> Integer.compare(e2.getAge(), e1.getAge())).toList().forEach(emp-> System.out.println(emp.getAge()));

        employees.stream().sorted((e1,e2)->Double.valueOf(e2.getSalary()).compareTo(Double.valueOf(e1.getSalary()))).toList().forEach(emp-> System.out.println(emp.getSalary()));
        employees.stream().sorted((e1,e2)->Integer.valueOf(e2.getAge()).compareTo(Integer.valueOf(e1.getAge()))).toList().forEach(emp-> System.out.println(emp.getAge()));


        /*
        Key Points:
        -----------
        1.	sorted() Without Arguments:
            •	Requires the Employee class to implement Comparable with a compareTo method.
        2.	sorted(Comparator):
            •	Allows custom sorting logic without modifying the Employee class.
            •	Use Comparator.comparing() for single attributes or thenComparing() for multiple attributes.
        3.	Chaining Comparators:
            •	Combine sorting by multiple criteria using .thenComparing().
        */

        // Create Comparators for Name and Salary fields respectively
        Comparator<Employee> sortByName = (e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName());
        Comparator<Employee> sortBySalary = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

        //Sort by Name then Sort by Salary
        employees.stream()
                .sorted(sortByName.thenComparing(sortBySalary))
                .forEach(emp->System.out.println(emp));


    }
}
