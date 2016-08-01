package oop.lecture9.unique.sorted.persons;

import java.util.*;

/**
 * @author ParseJava on 01.08.2016.
 */
public class UniqueSortedPersons {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Alexandra", 23));
        persons.add(new Person("Alexandra", 26));
        persons.add(new Person("Hagan", 31));
        persons.add(new Person("Hagan", 39));
        persons.add(new Person("Sam", 13));
        persons.add(new Person("Sam", 19));
        persons.add(new Person("Victory", 17));
        persons.add(new Person("Leonardo", 15));
        persons.add(new Person("Bob", 17));

        Set<Person> personsSet = new TreeSet<>();
        personsSet.addAll(persons);

        System.out.println(personsSet);
    }
}


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }
}