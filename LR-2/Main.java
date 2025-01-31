import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.util.stream.Collectors;



class Main {
public static void main(String[] args) {
    List<User> users = Arrays.asList(
            new User(1, "Ivan", "Petrov", 25, "Russia"),
            new User(2, "Anna", "Sidorova", 30, "USA"),
            new User(3, "John", "Doe", 22, "Canada"),
            new User(4, "Elena", "Ivanova", 35, "Russia"),
            new User(5, "Peter", "Parker", 28, "UK"),
            new User(6, "Bruce", "Wayne", 40, "USA")
    );


    System.out.println("Пользователи, отсортированные по фамилии:");
    users.stream()
            .sorted(Comparator.comparing(User::getLastName)) // Сортировка по lastName
            .forEach(System.out::println); // Вывод каждого пользователя


    System.out.println("\nПользователи, отсортированные по возрасту:");
    users.stream()
            .sorted(Comparator.comparingInt(User::getAge)) // Сортировка по age
            .forEach(System.out::println);


    boolean allAboveSeven = users.stream().allMatch(user -> user.getAge() > 7);
    System.out.println("\nВсе пользователи старше 7 лет? " + allAboveSeven);


    double averageAge = users.stream()
            .mapToInt(User::getAge)
            .average()
            .orElse(0);
    System.out.println("\nСредний возраст пользователей: " + averageAge);


    long uniqueCountries = users.stream()
            .map(User::getCountry)
            .distinct()
            .count();
    System.out.println("\nКоличество уникальных стран: " + uniqueCountries);
    }
}