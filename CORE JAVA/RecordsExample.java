public record Person(String name, int age) {}

import java.util.List;

public class RecordsExample {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice", 30), new Person("Bob", 25));
        people.forEach(System.out::println);
        // Filter based on age greater than 27:
        people.stream().filter(p -> p.age() > 27)
              .forEach(System.out::println);
    }
}