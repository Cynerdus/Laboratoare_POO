import java.util.Objects;

public class Student implements Comparable<Student> {
    /* ------------------------- Task 1 ------------------------- */
    private String name;
    private String surname;
    private long id;
    private double averageGrade;

    public Student(final String name, final String surname, final long id, final double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    /* Override `compareTo` and `toString` methods */

    @Override
    public int compareTo(Student o) {
        return (this.averageGrade == o.averageGrade) ? (this.surname.compareTo(o.surname) == 0) ? this.name.compareTo(o.name) :
                this.surname.compareTo(o.surname) : (this.averageGrade > o.averageGrade) ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + this.name
                + "', surname='" + this.surname
                + "', id=" + this.id
                + ", averageGrade=" + this.averageGrade
                + "}";
    }

    /* ------------------------- Task 5 ------------------------- */
    /* Override `equals` and `hashCode` methods */

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.id == student.getId()
                && this.averageGrade == student.getAverageGrade()
                && this.name.equals(student.getName())
                && this.surname.equals(student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getId(), getAverageGrade());
    }
}
