package org.HomeworkHoldiays;

import com.github.javafaker.Faker;

import java.util.Random;

public class OfficeEquipment {
    private int id;
    private String modelName;
    private String manufacturer;
    private int yearOfManufacture;
    private double price;
    private double weight;
    private boolean isOperational;

    public OfficeEquipment(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational) {
        this.id = id;
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.weight = weight;
        this.isOperational = isOperational;
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    @Override
    public String toString() {
        return "OfficeEquipment{ " +
                " id = " + id +
                ", modelName = '" + modelName + '\'' +
                ", manufacturer = '" + manufacturer + '\'' +
                ", yearOfManufacture = " + yearOfManufacture +
                ", price = " + price +
                ", weight (Gr) =" + weight +
                ", isOperational=" + isOperational +
                '}';
    }

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();
        OfficeEquipment[] officeEquipments = new OfficeEquipment[10];
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 1) {
                Monitor monitor = new Monitor(
                        faker.number().numberBetween(1, 100000),
                        faker.name().name(),
                        faker.company().industry(),
                        faker.number().numberBetween(1990, 2024),
                        faker.number().numberBetween(1000, 3000),
                        faker.number().numberBetween(1000, 10000),
                        faker.random().nextBoolean(),
                        faker.number().numberBetween(14, 47),
                        faker.number().numberBetween(480, 4000),
                        faker.name().name(),
                        faker.number().numberBetween(60, 240),
                        random.nextBoolean(),
                        faker.app().name(),
                        random.nextBoolean()
                );
                officeEquipments[i] = monitor;
            } else if (i == 2 || i == 3) {
                Laptop laptop = new Laptop(
                        faker.number().numberBetween(1, 100000),
                        faker.name().name(),
                        faker.company().industry(),
                        faker.number().numberBetween(1990, 2024),
                        faker.number().numberBetween(1000, 10000),
                        faker.number().numberBetween(1000, 10000),
                        faker.random().nextBoolean(),
                        faker.commerce().productName(),
                        faker.number().numberBetween(1, 128),
                        faker.number().numberBetween(128, 2048),
                        faker.number().randomDouble(2, 4, 10),
                        faker.number().numberBetween(10, 18),
                        faker.internet().domainName(),
                        random.nextBoolean());
                officeEquipments[i] = laptop;
            } else if (i == 4 || i == 5) {
                Printer printer = new Printer(
                        faker.idNumber().hashCode(),
                        faker.name().name(),
                        faker.company().industry(),
                        faker.number().numberBetween(1990, 2024),
                        faker.number().numberBetween(1000, 2000),
                        faker.number().numberBetween(1000, 10000),
                        faker.random().nextBoolean(),
                        faker.programmingLanguage().creator(),
                        faker.number().numberBetween(10, 500),
                        faker.number().numberBetween(480, 4000),
                        faker.color().name(),
                        faker.number().numberBetween(0, 5),
                        faker.options().toString(),
                        faker.number().numberBetween(1, 1000)
                );
                officeEquipments[i] = printer;
            } else if (i == 6 || i == 7) {
                Phone phone = new Phone(
                        faker.number().numberBetween(1, 100000),
                        faker.name().name(),
                        faker.company().industry(),
                        faker.number().numberBetween(1990, 2024),
                        faker.number().numberBetween(1000, 4000),
                        faker.number().numberBetween(1000, 10000),
                        faker.random().nextBoolean(),
                        faker.number().numberBetween(4, 10),
                        faker.number().numberBetween(4, 1024),
                        faker.file().fileName(),
                        faker.number().numberBetween(10, 150),
                        faker.random().nextBoolean(),
                        faker.number().numberBetween(1, 48),
                        faker.app().name()
                );
                officeEquipments[i] = phone;
            } else {
                Tablet tablet = new Tablet(
                        faker.number().numberBetween(1, 100000),
                        faker.name().name(),
                        faker.company().industry(),
                        faker.number().numberBetween(1990, 2024),
                        faker.number().numberBetween(1000, 5000),
                        faker.number().numberBetween(1000, 10000),
                        faker.random().nextBoolean(),
                        faker.number().numberBetween(6, 18),
                        faker.number().numberBetween(4, 1024),
                        faker.internet().domainName(),
                        faker.number().numberBetween(8, 160),
                        faker.random().nextBoolean(),
                        faker.number().numberBetween(1, 48),
                        faker.internet().domainWord()
                );
                officeEquipments[i] = tablet;
            }
        }
        printAllEquipment(officeEquipments);
        System.out.println("Cтоимость всей техники = " + calculateTotalPrice(officeEquipments) + "$.");
        listByManufacturer(officeEquipments, "Sony");
        findOldestEquipment(officeEquipments);
        countOperational(officeEquipments);
    }


    public static void printAllEquipment(OfficeEquipment[] officeEquipments) {
        for (int i = 0; i < 10; i++) {
            System.out.println(officeEquipments[i]);
            System.out.println(" ");
        }
    }

    public static int calculateTotalPrice(OfficeEquipment[] officeEquipments) {
        int sum = 0;
        for (int i = 0; i < officeEquipments.length; i++) {
            sum += officeEquipments[i].getPrice();
        }
        return sum;
    }

    public static void listByManufacturer(OfficeEquipment[] officeEquipment, String manufacturer) {
        for (int i = 0; i < officeEquipment.length; i++) {
            if (officeEquipment[i].getManufacturer().equals(manufacturer)) {
                System.out.println(officeEquipment[i]);
            }
        }
    }

    public static void findOldestEquipment(OfficeEquipment[] officeEquipments) {
        int oldestNumberOfEquipment = 0; // Год самого старого оборудования
        for (int i = 0; i < officeEquipments.length; i++) {
            if (officeEquipments[i].getYearOfManufacture() < officeEquipments[oldestNumberOfEquipment].getYearOfManufacture()) {
                oldestNumberOfEquipment = i;
            }
        }
        System.out.println("Cамая старая техника: " + officeEquipments[oldestNumberOfEquipment]);
        for (int i = 0; i < officeEquipments.length; i++) { // Другое самое старое оборудование того же года.
            if (officeEquipments[oldestNumberOfEquipment].getYearOfManufacture() == officeEquipments[i].getYearOfManufacture() && oldestNumberOfEquipment != i) {
                System.out.println("Другая самая старая техника этого же года: " + officeEquipments[i]);
            }
        }
    }

    public static void countOperational(OfficeEquipment[] officeEquipment) {
        int sum = 0;
        int i = 0;
        while (i < officeEquipment.length) {
            if (officeEquipment[i].isOperational == true) {
                sum++;
            }
            i++;
        }
        System.out.println("Количество исправной техники составляет: " + sum + " шт.");
    }
}
