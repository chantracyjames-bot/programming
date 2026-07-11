public class InventoryMain {

    public static String getResult(boolean result) {
        if(result) {
            return "Success!";
        }
        return "Error: Not enough stock!";
    }

    public static void main(String[] args) {
        InventoryTracker myProducts[] = new InventoryTracker[3];
        myProducts[0] = new InventoryTracker("Laptop", 2299.00, 20);
        myProducts[1] = new InventoryTracker("Phone", 899.00, 35);
        myProducts[2] = new InventoryTracker("Headphones", 129.00, 15);
        int i = 0;
        while(i < 3) {

            System.out.printf("%n%s%s%s%.2f%s%d", "Product: ", myProducts[i].getName(), " | Price: $", myProducts[i].getPrice(), " | Stock: ", myProducts[i].getQuantity());
            System.out.printf("%n%s%s%s%s", "Selling 5 ", myProducts[i].getName(), "s... ", getResult(myProducts[i].sellProduct(5)));
            if(myProducts[i].getPrice() > 500 && !myProducts[i].getDiscountStatus()) {
                System.out.print("High-value item detected. Applying 10% discount! New Value: "); 
                myProducts[i].setDiscountStatus(0.1);
                System.out.print(myProducts[i].getPrice());
            }
            if(myProducts[i].getQuantity() <= 3) {
                System.out.printf("%n%s%s%s", "Low stock alert! Restocking 10 units of ", myProducts[i].getName(), "s. New stock: ");
                myProducts[i].restockProduct(10);
                System.out.print(myProducts[i].getQuantity());
            }
            i++;
        }
        // for debugging
        System.out.printf("%n%s%s%s%.2f%s%d", "Product: ", myProducts[0].getName(), " | Price: $", myProducts[0].getPrice(), " | Stock: ", myProducts[0].getQuantity());
        System.out.printf("%n%s%s%s%.2f%s%d", "Product: ", myProducts[1].getName(), " | Price: $", myProducts[1].getPrice(), " | Stock: ", myProducts[1].getQuantity());
        System.out.printf("%n%s%s%s%.2f%s%d", "Product: ", myProducts[2].getName(), " | Price: $", myProducts[2].getPrice(), " | Stock: ", myProducts[2].getQuantity());
    }
}
