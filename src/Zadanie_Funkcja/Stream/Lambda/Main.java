package Zadanie_Funkcja.Stream.Lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Lukasz", "Kowalski", 23),
                new Person("Paweł", "Dobry", 56),
                new Person("Jan", "Paweł", 43));

        personList.sort((p1, p2) -> p1.surename.compareTo(p2.surename));

        personList.forEach(s -> System.out.println("Imie: " + s.name));

        personList.sort((p1, p2) -> p1.age.compareTo(p2.age));

        personList.forEach(s -> System.out.println("Imie: " + s.name));

        Stream.of( 1, 2, 3, 4, 5, 6, 7 ).sorted().forEach(System.out::println);


    }
}
