package oop;
import java.util.*;

class Laptop {
    private int id;
    private String name;
    private double price;
    private int ramSpace;
    private int hardDiskSpace;

    public Laptop() {
    }

    public Laptop(int id, String name, double price, int ramSpace, int hardDiskSpace) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ramSpace = ramSpace;
        this.hardDiskSpace = hardDiskSpace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRamSpace() {
        return ramSpace;
    }

    public void setRamSpace(int ramSpace) {
        this.ramSpace = ramSpace;
    }

    public int getHardDiskSpace() {
        return hardDiskSpace;
    }

    public void setHardDiskSpace(int hardDiskSpace) {
        this.hardDiskSpace = hardDiskSpace;
    }

    public void displayLaptopInfo() {
        System.out.println(getId() + " \t" + getName() + " \t" + getPrice() + " \t" + getRamSpace() + "GB \t" + getHardDiskSpace() + "GB");
    }
}

public class Q8_WAP_to_create_POJO_class_name_as_Laptop_with_field_id_name_price_and_ram_space_hard_disk_space_etc_and_input_the_details_of_laptop_and_display_it {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of laptops you want to add:");
        int size = s.nextInt();

        ArrayList<Laptop> laptops = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Laptop ID:");
            int id = s.nextInt();
            s.nextLine();

            System.out.println("Enter Laptop Name:");
            String name = s.nextLine();

            System.out.println("Enter Laptop Price:");
            double price = s.nextDouble();
            
            System.out.println("Enter RAM Space (GB):");
            int ramSpace = s.nextInt();

            System.out.println("Enter Hard Disk Space (GB):");
            int hardDiskSpace = s.nextInt();

            laptops.add(new Laptop(id, name, price, ramSpace, hardDiskSpace));
        }

        System.out.println("\nID \tName \tPrice \tRAM \tHard Disk");
        for (int i = 0; i < laptops.size(); i++) {
            laptops.get(i).displayLaptopInfo();
        }
    }
}
