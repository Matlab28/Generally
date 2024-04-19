package Universty;

import java.util.*;

public class Info {
    Map<Integer, String> students;
    List<Integer> number;
    LinkedList<String> addStudent;
    private String universityName, group, studentName, studentSurname, studentFather, faculty, specialty;
    private int studentId;

    public Info() {
        students = new LinkedHashMap<>();
        number = new ArrayList<>();
        addStudent = new LinkedList<>();
    }

    public void system(Scanner scanner) {
        System.out.print("How many students do you want to add? - ");
        int totalStudents = scanner.nextInt();
        number.add(totalStudents);
        int count = 1;
        int result = 1;
        int period = 1;

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter " + (count++) + ". student's name: ");
            setStudentName(scanner.next());
            System.out.print("Enter " + (period++) + ". student's surname: ");
            setStudentSurname(scanner.next());
            System.out.print("Enter " + (result++) + ". student's father's name: ");
            setStudentFather(scanner.next());
            System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n ");
            exceptions();

            addStudent.add(getStudentName());
            addStudent.add(getStudentSurname());
            addStudent.add(getStudentFather());
        }

        addStudent
                .forEach(System.out::println);


    }

    public void exceptions() {
        String letters = "^(?=.*[a-z])(?=.*[A-Z]).+$\n";
        String numbers = ".*\\d+.*";

        if (!getStudentName().matches(letters) ||
                !getStudentSurname().matches(letters) ||
                getStudentFather().matches(letters)) {
            System.out.println("All of them must contain letters...");
        }
        if (getStudentName().matches(numbers) ||
                getStudentSurname().matches(numbers) ||
                getStudentFather().matches(numbers)) {
            System.out.println("They cannot contain any numbers...");
        }

    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentFather() {
        return studentFather;
    }

    public void setStudentFather(String studentFather) {
        this.studentFather = studentFather;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
