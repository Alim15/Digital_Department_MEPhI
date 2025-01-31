import java.util.Iterator;
import java.util.List;

class StudentManager {
    // Метод для удаления студентов с низким средним баллом и перевода остальных на следующий курс
    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.AverageMark() < 3.0) {
                iterator.remove(); // Удаляем студента, если его средний балл ниже 3
            } else {
                student.promoteToNextCourse(); // Переводим на следующий курс
            }
        }
    }

    // Метод для вывода студентов определенного курса
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}