import java.util.List;
import java.util.ArrayList;

class Student {
    private String name;   // Имя студента
    private String group;  // Группа, в которой учится студент
    private int course;    // Курс обучения
    private List<Integer> grades; // Список оценок студента

    // Конструктор для создания объекта студента
    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    // Метод для вычисления среднего балла студента
    public double AverageMark(){
        int sum = 0;
        for (int i = 0; i < marks.size(); i++) {
            sum += marks.get(i);
        }
        return (double) sum / marks.size();
    }


    public void promoteToNextCourse() {
        if (course < 5) {
            course++;
        }
    }

    @Override
    public String toString() {
        return name + " (Группа: " + group + ", Курс: " + course + ", Средний балл: " + getAverageGrade() + ")";
    }
}
