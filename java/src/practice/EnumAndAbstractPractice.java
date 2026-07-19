 enum VehicleType {
    CAR,
    TRUCK,
    MOTORCYCLE
}

abstract class Vehicle {
    String id;
    double baseRate;
    VehicleType type;

    // i'll just assume that the given stuff is complete
    // it's a pain to account for each attribute
    public Vehicle(String id, double baseRate, VehicleType type) {
        this.id = id;
        this.baseRate = baseRate;
        this.type = type;
    }
    public String getID() {
        return id;
    }
    public double getBaseRate() {
        return baseRate;
    }
    public VehicleType getType() {
        return type;
    }
    public abstract double calcRental(int days);
}

class Car extends Vehicle {
    private boolean hasInsurance;

    Car(String id, double baseRate, VehicleType type, boolean hasInsurance) {
        super(id, baseRate, type);
        this.hasInsurance = hasInsurance;
    }

    public double calcRental(int days) {
        if(this.hasInsurance) {
            return (this.baseRate * days) + (15 * days);
        }
        return (this.baseRate * days);
    }

    public boolean getInsurance() {
        return this.hasInsurance;
    }
}

class Truck extends Vehicle {
    private double cargoCapacity;

    Truck(String id, double baseRate, VehicleType type, double cargoCapacity) {
        super(id, baseRate, type);
        this.cargoCapacity = cargoCapacity;
    }

    public double calcRental(int days) {
        if(this.cargoCapacity > 3.0) {
            return (this.baseRate * days) + 50;
        }
        return(this.baseRate * days);
    }

    public double getCargoCap() {
        return this.cargoCapacity;
    }
}

public class EnumAndAbstractPractice {

    public static String insuranceStuff(boolean idk) {
        if(idk) {
            return "with Insurance";
        }
        return "No Insurance";
    }

    public static String cargoStuff(double idk) {
        if(idk > 3.0) {
            return "Heavy-duty Fee Applied";
        }
        return "No Heavy-duty Fee";
    }

    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[3];
        fleet[0] = new Car("C101", 50, VehicleType.CAR, true);
        fleet[1] = new Car("C102", 50, VehicleType.CAR, false);
        fleet[2] = new Truck("T201", 90, VehicleType.TRUCK, 5.0);

        int i = 0;
        int days = 7;
        while (i < 3) {
            System.out.printf("%n%s%s%s%s%s%.2f", "Vehicle ID: ", fleet[i].getID(), " | Type: ", fleet[i].getType(), " | Daily Base Rate: ", fleet[i].getBaseRate());
            System.out.printf("%n%s%d%s", "Rental cost for ", days, " days (");
            if(fleet[i] instanceof Car car) {
                System.out.printf("%s", insuranceStuff(car.getInsurance()));
            }
            else if(fleet[i] instanceof Truck truck) {
                System.out.printf("%s", cargoStuff(truck.getCargoCap()));
            }
            System.out.printf("%s%.2f%n%s", "): ", fleet[i].calcRental(days), "-----------------------------------------");
            i++;
        }
    }
}
