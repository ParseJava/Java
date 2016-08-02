package oop.lecture9.age.categories.persons;

import java.util.*;

/**
 * @author ParseJava on 01.08.2016.
 */
public class AgeCategoriesPersons {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 15));
        persons.add(new Person("Alexandra", 23));
        persons.add(new Person("Alexandra", 17));
        persons.add(new Person("Hagan", 31));
        persons.add(new Person("Hagan", 39));
        persons.add(new Person("Sam", 13));
        persons.add(new Person("Sam", 19));
        persons.add(new Person("Victory", 17));
        persons.add(new Person("Leonardo", 15));
        persons.add(new Person("Bob", 17));


        NavigableMap<Integer, List<Person>> personsMap = new TreeMap<>();

        fillPersonsMap(persons, personsMap);

        int age = 18;

        System.out.println(findYoungerManOlderThan(personsMap, age));

//        [{name='Sam', age=19}]

        System.out.println(findOlderManYoungerThan(personsMap, age));

//        [{name='Alexandra', age=17}, {name='Victory', age=17}, {name='Bob', age=17}]
    }

    private static void fillPersonsMap(List<Person> persons, NavigableMap<Integer, List<Person>> personsMap) {
        for (Person person : persons) {
            List<Person> personList = new ArrayList<>();
            personList.add(person);

            personsMap.put(person.getAge(), checkValue(personsMap, person, personList));
        }
    }

    private static List<Person> checkValue(NavigableMap<Integer, List<Person>> personsMap, Person person, List<Person> personList) {
        return (personsMap.get(person.getAge()) == null) ?
                personList : addPerson(personsMap.get(person.getAge()), person);
    }

    private static List<Person> addPerson(List<Person> persons, Person person) {
        persons.add(person);
        return persons;
    }

    private static List<Person> findYoungerManOlderThan(NavigableMap<Integer, List<Person>> personsMap, int age) {
        int key = personsMap.subMap(age, 100).firstKey();
        return personsMap.get(key);
    }

    private static List<Person> findOlderManYoungerThan(NavigableMap<Integer, List<Person>> personsMap, int age) {
        int key = personsMap.subMap(12, age + 1).lastKey();
        return personsMap.get(key);
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
