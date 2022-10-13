package task2;

import java.util.List;

public class Internship {
    public String name;
    public String minGrade;
    public List<Student> students;

    public Internship(String _name, String _minGrade, List<Student> _students) {
        name = _name;
        minGrade = _minGrade;
        students = _students;
    }

    public String chooseCandidateRandomly() {
        int randomNumber = (int)(Math.random() * (students.size()) + 1);
        return students.get(randomNumber).getName();
    }

    public void chooseCandidatesForInterview() {
        for (Student student : students) {
            if (student.getGrade() >= Integer.parseInt(minGrade))
                System.out.println("Candidate " + student.getName() + " got a phone interview at " + name);
        }
    }

}
