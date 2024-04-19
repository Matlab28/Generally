package Coffee;

public class Coffee {
    public int kettle;
    public boolean coffee;

    public void coffeeMaking() {}
    public boolean drinkCoffee() {}

    public boolean drinking() {coffee()}
    public void addCoffee(){}
    public void prepareCoffee(){}





    public void coffee() {
        while (true) {
            System.out.println("Drink coffee:");
            coffeeMaking();
            boolean empty = false;

            if (coffee != empty) {
                drinkCoffee();
                break;
            } else {
                brewCoffee();
            }
        }
    }

    public void brewCoffee() {
        System.out.println("Take some coffee");
        addCoffee();

        if (kettle == 92) {
            prepareCoffee();
        } else {
            System.out.println("Let it boil");
        }
    }












}
