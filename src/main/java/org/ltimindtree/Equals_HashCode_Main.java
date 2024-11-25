package org.ltimindtree;

import java.util.Objects;

class Person {
    private String name;
    private String aadhaarNo;
    private Integer age;

    public Person(String aadhaarNo, String name, Integer age) {
        this.name = name;
        this.aadhaarNo = aadhaarNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //toString
    @Override
    public String toString() {
        return "Person =[ name: " + name + " aadhaarNo: " + aadhaarNo + " age: " + age + " ]";
    }

    //hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, aadhaarNo, age);
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person p = (Person) obj;
        return Objects.equals(this.name, p.name) && Objects.equals(this.aadhaarNo, p.aadhaarNo) && Objects.equals(this.age, p.age);
    }
}

public class Equals_HashCode_Main {
    public static void main(String[] args) {
        Person p1 = new Person("100", "Narasimha", 38);
        Person p2 = new Person("100", "Narasimha", 42);
        Person p3 = new Person("100", "Narasimha", 42);
        Person p4 = new Person("103", "Narasimha", 58);

        if (p1.equals(p2))
            System.out.println("p1 and p2 are same ");
        else
            System.out.println("p1 and p2 are NOT same ");

        if (p3.equals(p2))
            System.out.println("p3 and p2 are same ");
        else
            System.out.println("p3 and p2 are NOT same ");
    }
}