package task2;

public class Student {
    private String name;
    private double grade;

    public Student (String _name, double _grade) {
        name = _name;
        grade = _grade;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double _grade) {
        grade = _grade;
    }

}
