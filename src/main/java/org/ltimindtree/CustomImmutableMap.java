package org.ltimindtree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

final class MyImmutable{
    private String name;
    private Integer age;
    private Map<String, Integer> skillRating;

    public MyImmutable(String name, Integer age, Map<String, Integer> skillRating) {
        this.name = name;
        this.age = age;
        Map<String, Integer> tempSkillRating=new HashMap<>();
        for(Map.Entry<String, Integer> entry : skillRating.entrySet()){
            tempSkillRating.put(entry.getKey(),entry.getValue());
        }
        this.skillRating = tempSkillRating;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Map<String, Integer> getSkillRating() {
        Map<String, Integer> tempSkillRating=new HashMap<>();
        for(Map.Entry<String, Integer> entry : skillRating.entrySet()){
            tempSkillRating.put(entry.getKey(),entry.getValue());
        }
        return tempSkillRating;
    }

    @Override
    public String toString() {
        return "MyImmutable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skillRating=" + skillRating +
                '}';
    }
}
public class CustomImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> skillRating=new HashMap<>();
        skillRating.put("Java",4);
        skillRating.put("Spring Boot",4);
        skillRating.put("Microservices",4);

        MyImmutable immute=new MyImmutable("Nazeer",34,skillRating);
        System.out.println(immute.getName());
        System.out.println(immute.getAge());
        System.out.println(immute.getSkillRating());
        skillRating.put("SQL",2);
        skillRating.put("System Design", 1);
        System.out.println(immute.getSkillRating());
    }
}
