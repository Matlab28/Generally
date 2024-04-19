package IdCheck;

import java.util.*;

public class Citizenship {
    private String name, citizenship, id;

    Map<String, String> info;
    List<String> citizen;

    public Citizenship() {
        info = new LinkedHashMap<>();
        citizen = new ArrayList<>();
    }

    public void checking(Scanner scanner) {
        while (true) {
            System.out.print("Enter your name: ");
            setName(scanner.next());
            System.out.print("Enter your ID number: ");
            setId(scanner.next());

            String letters = "^(?=.*[a-z])(?=.*[A-Z]).+$\n";
            String numbers = ".*\\d+.*";

            if (!getId().matches(letters) && !getId().matches(numbers)) {
                System.out.println("Ity must contain letters and numbers as well...");
                continue;
            }

            info.put(getId(), getName());


        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
