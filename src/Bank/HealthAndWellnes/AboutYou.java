package Bank.HealthAndWellnes;

import java.util.Scanner;

public class AboutYou {
    private String name;
    private String gender;
    private double height;
    private double weight;
    private int age;

    public void yourInfo(Scanner scanner) {
        AboutYou aboutYou = new AboutYou();
        System.out.print("Enter your gender (male or female): ");
        aboutYou.setGender(scanner.next());
        System.out.print("Enter your age: ");
        aboutYou.setAge(scanner.nextInt());
        System.out.print("Enter your height (with cm): ");
        aboutYou.setHeight(scanner.nextDouble());
        System.out.print("Enter your weight (with kg): ");
        aboutYou.setWeight(scanner.nextDouble());
        double heightCm = (aboutYou.getHeight() % 100) ;
        System.out.println("Your height with meter: " + heightCm);
        double bmi = aboutYou.getWeight() / (heightCm * heightCm);
        System.out.println("Your BMI (Body Mass Index) is: " + bmi + "\n");
        double ibw = bmi * (heightCm * heightCm);
        System.out.println("Your 'Ideal Body Weight' is: " + ibw);

        if (aboutYou.getGender().equalsIgnoreCase("male")) {

        }
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
