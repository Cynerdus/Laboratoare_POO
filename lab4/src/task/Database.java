package task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.Collections.sort;
import static java.util.Collections.swap;

public class Database {
    private static Database database = null;
    private static int instanceCount = 0;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    private Database() { instanceCount++;}

    public static Database getDatabase() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public static int getNumberOfInstances() {
        return instanceCount;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List <Teacher> targetTeachers = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getSubjects().contains(subject)) {
                targetTeachers.add(teacher);
            }
        }
        return targetTeachers;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List <Student> targetStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getSubjects().get(subject) != null) {
                targetStudents.add(student);
            }
        }
        return targetStudents;
    }

    public List<Student> getStudentsByAverageGrade() {
        List <Student> sortedStudents = new ArrayList<>(students);
        sortedStudents.sort(Comparator.comparing(Student::averageGrade));

        return sortedStudents;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List <Student> sortedStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getSubjects().containsKey(subject)) {
                sortedStudents.add(student);
            }
        }

        sortedStudents.sort(Comparator.comparingInt(obj -> {
            return obj.getGradeForSubject(subject);
        }));

        return sortedStudents;
    }
}
