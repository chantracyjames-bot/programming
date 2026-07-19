import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

interface Borrowable {
    void borrowItem();
    double calcOverdueFee(int daysLate);
}

class Books implements Borrowable {
    private String title;

    Books(String title) {
        this.title = title;
    }

    public void borrowItem() {
        LocalDateTime timeObj = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTime = timeObj.format(format);
        System.out.printf("%s%s%s%s", "Success! ", this.title, " has been checked out on: ", formattedTime);
    }

    public double calcOverdueFee(int daysLate) {
        return daysLate * 0.5;
    }
}

class DVD implements Borrowable {
    private String title;

    DVD(String title) {
        this.title = title;
    }

    public void borrowItem() {
        LocalDateTime timeObj = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTime = timeObj.format(format);
        System.out.printf("%s%s%s%s", "Success! ", this.title, " has been checked out on: ", formattedTime);
    }

    public double calcOverdueFee(int daysLate) {
        return daysLate * 2.0;
    }
}

public class TimeAndInterfacePractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 1;

        Books bookObj = new Books("The Great Gatsby");
        DVD dvdObj = new DVD("If My Heart Had Wings: Flight Diary");

        while(key == 1) {
            int tempVar;
            System.out.printf("%n%s", "--- Welcome to the Library Portal --- \n1. Borrow an Item\n2. Return an Item\nChoose an option: ");

            switch (in.nextInt()) {
                case 1:
                    System.out.printf("%s", "What would you like to borrow? (1 for Book or 2 for DVD)\nInput: ");
                    tempVar = in.nextInt();
                    if(tempVar == 1) { bookObj.borrowItem(); } 
                    else if(tempVar == 2) { dvdObj.borrowItem(); }
                    else { System.out.println("Invalid Option."); }
                    break;
                case 2:
                    System.out.printf("%s", "Which item are you returning? (1 for Book or 2 for DVD): ");
                    tempVar = in.nextInt();
                    System.out.printf("%s", "How many days late is it?: ");
                    int daysLateCount = in.nextInt();
                    if(tempVar == 1) { System.out.printf("%s%f", "The overdue fee for the DVD is: $", bookObj.calcOverdueFee(daysLateCount)); } 
                    else if(tempVar == 2) { System.out.printf("%s%.2f", "The overdue fee for the DVD is: $", dvdObj.calcOverdueFee(daysLateCount)); }
                    else { System.out.println("Invalid Option."); }
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println("\n-----------------------------------------");
        }
        in.close();
    }
}
