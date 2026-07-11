import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum TierType {
    ECONOMY,
    PREMIUM,
    HOVER
}

abstract class Ride {
    protected String passengerName;
    protected double distanceInMiles;
    protected TierType tier;

    Ride(String passengerName, double distanceInMiles, TierType tier) {
        this.passengerName = passengerName;
        this.distanceInMiles = distanceInMiles;
        this.tier = tier;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public double getDistanceTraveleved() {
        return this.distanceInMiles;
    }

    public TierType getTierType() {
        return this.tier;
    }

    public abstract double calcFare();
}

class StandardRide extends Ride {
    StandardRide(String passengerName, double distanceInMiles) {
        super(passengerName, distanceInMiles, TierType.ECONOMY);
    }

    public double calcFare() {
        return 5 + (this.distanceInMiles * 2.50);
    }
}

class LuxuryRide extends Ride {
    private boolean isPeakHour;

    LuxuryRide(String passengerName, double distanceInMiles, boolean isPeakHour) {
        super(passengerName, distanceInMiles, TierType.PREMIUM);
        this.isPeakHour = isPeakHour;
    }

    public double calcFare() {
        if(this.isPeakHour) {
            return (15 + (4.5 * this.distanceInMiles)) * 1.5;
        }
        return 15 + (4.5 * this.distanceInMiles);
    }

    public boolean getPeakHourStatus() {
        return this.isPeakHour;
    }
}

public class RideDispatcher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ride rides[] = {
            new StandardRide("Alice", 10),
            new LuxuryRide("Bob", 20, true),
            new LuxuryRide("Charlie", 30, false)
        };
        while(true) {
            System.out.printf("%n%s%n%s%n%s%n%s%n%s", "=== NEO-TOKYO DISPATCH SYSTEM ===", "1. View Active Manifest", "2. Dispatch & Bill Passenger", "3. Shut Down System", "Option: ");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    System.out.println();
                    for(int i = 0; i < rides.length; i++) {
                        if (rides[i] instanceof StandardRide stdride) {
                            System.out.printf("%s%d %s%s%s %n%s%.2f%n", "Passenger #", i + 1, stdride.getPassengerName(), " - Tier: ", stdride.getTierType(), "Distance Traveled: ", stdride.getDistanceTraveleved());  
                        } else if (rides[i] instanceof LuxuryRide luxride) {
                            System.out.printf("%s%d %s%s%s %n%s%.2f%s%s%s%n", "Passenger #", i + 1, luxride.getPassengerName(), " - Tier: ", luxride.getTierType(), "Distance Traveled: ", luxride.getDistanceTraveleved(), " (Peak Hour Fee: ", luxride.getPeakHourStatus() ? "enabled" : "disabled", ")");
                        }
                    }
                    break;
                case 2:
                    in.nextLine();
                    System.out.print("\nEnter Passenger Name: ");
                    String temp = in.nextLine();
                    boolean smthTest = false;
                    for(int i = 0; i < rides.length; i++) {
                        if(rides[i].getPassengerName().equals(temp)) {
                            System.out.println("Matching Passenger Found!");
                            smthTest = true;
                            LocalDateTime timeStuff = LocalDateTime.now();
                            DateTimeFormatter tempTime = DateTimeFormatter.ofPattern("EEE, MMM dd HH:mm:ss yyyy"); // can't get zone ID, possibly a linux thing
                            String timeNow = timeStuff.format(tempTime);
                            if (rides[i] instanceof StandardRide stdride) { 
                                System.out.printf("%s%s%s%s%s%n", "Generating Receipt for ", stdride.getPassengerName(), " [Tier: ", stdride.getTierType(), "]");
                                System.out.printf("%s%s %n%s%.1f%s%n", "Timestamp: ", timeNow, "Base Distance: ", stdride.getDistanceTraveleved(), " miles!");
                                System.out.printf("%s%.2f%n", "Final Fare: $", rides[i].calcFare());
                            } else if (rides[i] instanceof LuxuryRide luxride) {
                                System.out.printf("%s%s%s%s%s%n", "Generating Receipt for ", luxride.getPassengerName(), " [Tier: ", luxride.getTierType(), "]");
                                System.out.printf("%s%s %n%s%.1f%s%n", "Timestamp: ", timeNow, "Base Distance: ", luxride.getDistanceTraveleved(), " miles!");
                                System.out.printf("%s%s%n", "Surge pricing was ", luxride.getPeakHourStatus() ? "active!" : "not active!");
                                System.out.printf("%s%.2f%n", "Final Fare: $", luxride.calcFare());
                            }
                            break;
                        } 
                    }
                    if(smthTest == false) { System.out.println("Passenger not found in active dispatch pool."); }
                    break;
                case 3:
                    System.out.println("Exitting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input. Try again.");

            }
        in.close();
        }
    }
}
