package task2;

import java.util.ArrayList;
import java.util.List;

public class JobMarket {
    public static void main(String[] args) {

        /* --- task 2 --- */
        System.out.println("--- Task 2 ---");

        Student Gigel = new Student("Gigel", 10);
        Student Dorel = new Student("Dorel", 7);
        Student Marcel = new Student("Marcel", 6);
        Student Ionel = new Student("Ionel", 3);

        List <Student> students= new ArrayList<>();
        students.add(Gigel);
        students.add(Dorel);
        students.add(Marcel);
        students.add(Ionel);

        Internship Google = new Internship("Google", "8", students);
        Internship Amazon = new Internship("Amazon", "7", students);
        Internship Facebook = new Internship("Facebook", "6", students);
        Internship Microsoft = new Internship("Microsoft", "2", students);

        Google.chooseCandidatesForInterview();
        Amazon.chooseCandidatesForInterview();
        Facebook.chooseCandidatesForInterview();
        Microsoft.chooseCandidatesForInterview();

        /* --- task 3 --- */
        System.out.println("--- Task 3 ---");

        Student Juan = new Student("Juan", 10);
        Student Luan = new Student("Juan", 10);

        if (Juan.equals(Luan))
            System.out.println("Juan and Luan are the same person omg");
        else
            System.out.println("Juan and Luan are not the same smh");

        /* --- task 4 --- */
        System.out.println("--- Task 4 ---");

        Student Mercedesa = new Student();
        Mercedesa.setName("Mercedesa");
        Mercedesa.setGrade(5);

        System.out.println(Mercedesa.getName() + "'s grade is " + Mercedesa.getGrade());
    }
}
