package UniSystem;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class General {
    Map<Integer, String> system;
    LinkedList<Integer> numbers;
    LinkedList<String> listOfStudents;
    private String studentName, studentSurname, studentFather, group, faculty, specialty, uniName, gender;
    private int studentAge, course, studentId;

    public General() {
        system = new LinkedHashMap<>();
        numbers = new LinkedList<>();
        listOfStudents = new LinkedList<>();
    }

    public void information(Scanner scanner) {
        while (true) {
            System.out.print("how many students do you want to add? ");
            int enterNumber = scanner.nextInt();
            numbers.add(enterNumber);
            int count1 = 1;
            int count2 = 1;
            int count3 = 1;
            int count4 = 1;
            int count5 = 1;

            for (int i = 0; i < enterNumber; i++) {
                System.out.print("Enter " + (count4++) + ". student's ID: ");
                setStudentId(scanner.nextInt());
                System.out.print("Enter " + (count5++) + ". student's gender: ");
                setGender(scanner.next());
                System.out.print("Enter " + (count1++) + ". student's name: ");
                setStudentName(scanner.next());
                System.out.print("Enter " + (count2++) + ". student's surname: ");
                setStudentSurname(scanner.next());
                System.out.print("Enter " + (count3++) + ". student's father's name: ");
                setStudentFather(scanner.next());

                if (getGender().equalsIgnoreCase("male") || getGender().equalsIgnoreCase("female")) {
                    throw new RuntimeException("It must be male or female...");
                }

                system.put(getStudentId(), getStudentName());
                listOfStudents.add(getStudentSurname());
                listOfStudents.add(getStudentFather());
                listOfStudents.add(getGender());
            }

            int result1 = 1;
            int result2 = 1;

            for (Map.Entry<Integer, String> st : system.entrySet()) {
                System.out.println(result1++ + ". student's ID and name: '" + st.getKey() + "', " + st.getValue());
            }

            for (String list : listOfStudents) {
                System.out.println(result2++ + ". student's surname and father's name: " + list);
            }
        }
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
