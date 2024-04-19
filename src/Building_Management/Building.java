package Building_Management;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Building extends Exception {
    Map<String, String> gas, light, water, wifi;
    LinkedList<String> parking;
    private String utilities, chat, gasCode, lightCode, waterCode, wifiCode;
    private int prices;

    public Building() {
        gas = new LinkedHashMap<>();
        light = new LinkedHashMap<>();
        water = new LinkedHashMap<>();
        wifi = new LinkedHashMap<>();
        parking = new LinkedList<>();
    }
    public void management(Scanner scanner) {

        System.out.print("Enter the subscriber code for gas: ");
        setGasCode(scanner.next());
        errors();
        System.out.print("Enter your name: ");
        String name = scanner.next();
        gas.put(getGasCode(), name);

        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        System.out.print("Enter the subscriber code for the water: ");
        setWaterCode(scanner.next());
        water.put(getWaterCode(), name);

        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        System.out.print("Enter the subscriber code for the light: ");
        setLightCode(scanner.next());

    }

    public void errors() {
        String letters = "^(?=.*[a-z])(?=.*[A-Z]).+$\n";
        String numbers = ".*\\d+.*";
        if (getGasCode().matches(letters) || getWaterCode().matches(letters) ||
                getLightCode().matches(letters) || getWifiCode().matches(letters)) {
            throw new RuntimeException("It cannot any contain letters...");
        } else if (!getWifiCode().matches(numbers) || !getLightCode().matches(numbers) ||
                !getGasCode().matches(numbers) || !getWaterCode().matches(numbers)) {
            throw new RuntimeException("It must contain only numbers...");
        }
    }

    public String getGasCode() {
        return gasCode;
    }

    public void setGasCode(String gasCode) {
        this.gasCode = gasCode;
    }

    public String getLightCode() {
        return lightCode;
    }

    public void setLightCode(String lightCode) {
        this.lightCode = lightCode;
    }

    public String getWaterCode() {
        return waterCode;
    }

    public void setWaterCode(String waterCode) {
        this.waterCode = waterCode;
    }

    public String getWifiCode() {
        return wifiCode;
    }

    public void setWifiCode(String wifiCode) {
        this.wifiCode = wifiCode;
    }

    public String getUtilities() {
        return utilities;
    }

    public void setUtilities(String utilities) {
        this.utilities = utilities;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }
}
