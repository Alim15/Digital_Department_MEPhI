import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Добавляем студентов в список
        students.add(new Student("Иван Иванов", "Группа 101", 1, List.of(4, 3, 5)));
        students.add(new Student("Петр Петров", "Группа 102", 1, List.of(2, 2, 3)));
        students.add(new Student("Мария Смирнова", "Группа 103", 2, List.of(5, 4, 4)));
        students.add(new Student("Ольга Козлова", "Группа 104", 2, List.of(3, 3, 3)));

        System.out.println("Список студентов до обработки:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Удаляем студентов с низкими оценками и переводим остальных
        StudentManager.processStudents(students);

        System.out.println("\nСписок студентов после обработки:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Выводим студентов 2 курса
        System.out.println();
        StudentManager.printStudents(students, 2);
    }
}
