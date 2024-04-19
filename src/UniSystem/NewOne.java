package UniSystem;

import java.util.*;

public class NewOne {
    Map<Integer, String> university, students;
    LinkedList<String> list;
    List<String> facultyOfThem, specialtyOfThem;
    private String firstName, lastName, fatherName, uniName, faculty, specialty;
    private int age, uniId, studentId;

    public NewOne() {
        university = new LinkedHashMap<>();
        students = new LinkedHashMap<>();
        list = new LinkedList<>();
        facultyOfThem = new LinkedList<>();
        specialtyOfThem = new LinkedList<>();
    }

    public void uniSet(Scanner scanner) {
        System.out.print("Enter the university ID: ");
        setUniId(scanner.nextInt());
        System.out.print("Enter the university name: ");
        setUniName(scanner.next());

        university.put(getUniId(), getUniName());

        facSpeSet(scanner);
        System.out.println("===================================");
        system(scanner);
    }

    public void facSpeSet(Scanner scanner) {
        System.out.print("Enter the name of faculty: ");
        setFaculty(scanner.next());
        System.out.print("Enter the name of specialty: ");
        setSpecialty(scanner.next());

        facultyOfThem.add(getFaculty());
        specialtyOfThem.add(getSpecialty());
    }

    public void system(Scanner scanner) {
        while (true) {
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.print("Enter the student ID: ");
            setStudentId(scanner.nextInt());
            System.out.print("Enter the student's first name: ");
            setFirstName(scanner.next());
            System.out.print("Enter the student's last name: ");
            setLastName(scanner.next());
            System.out.print("Enter the student's father name: ");
            setFatherName(scanner.next());
//            System.out.print("Enter the student's age: ");
//            setAge(scanner.nextInt());

            if (getFirstName().equalsIgnoreCase("display") ||
                    getLastName().equalsIgnoreCase("display") ||
                    getFatherName().equalsIgnoreCase("display")) {
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                display();
                break;
            }

            students.put(getStudentId(), getFirstName());
            list.add(getLastName());
            list.add(getFatherName());
        }
    }

    public void display() {
        for (Map.Entry<Integer, String> uni : university.entrySet()) {
            System.out.println("University name: " + uni.getValue() + "\n");
            for (Map.Entry<Integer, String> std : students.entrySet()) {
                System.out.println("Student name: " + std.getValue() + "\n");
                for (String listOfIt : list) {
                    System.out.println("Rest of the list: " + listOfIt + "\n");
                }
            }
        }
        showFactSpec();
    }

    public void showFactSpec() {
        for (String faculty : facultyOfThem) {
            for (String specialty : specialtyOfThem) {
                System.out.println("Faculty: " + faculty);
                System.out.println("Specialty: " + specialty);
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUniId() {
        return uniId;
    }

    public void setUniId(int uniId) {
        this.uniId = uniId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
