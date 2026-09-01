public class SameFolderImportPractice {
    private String name;
    private double price;
    private int quantity;
    private boolean isDiscounted = false;

    public SameFolderImportPractice
(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public SameFolderImportPractice
(String name, double price) { 
        this(name, price, 0); 
        System.out.println("Warning: item quantity has not been set, continuing with 0");
    }

    public SameFolderImportPractice
(String name, int quantity) { 
        this(name, 0.00, quantity);
        System.out.println("Warning: item price has not been set, continuing with 0.00");
    }

    public SameFolderImportPractice
(double price, int quantity) {
        this("Unknown", price, quantity);
        System.out.println("Warning: item name has not been set, continuing with Unkown");
    }

    public SameFolderImportPractice
(double price) {
        this("Unknown", price, 0);
        System.out.println("Warning: item name and quantity has not been set, continuing with Unkown and 0");
    }

    public SameFolderImportPractice
(int quantity) {
        this("Unknown", 0.00, quantity);
        System.out.println("Warning: item name and price has not been set, continuing with Unkown and 0.00");
    }

    public SameFolderImportPractice
(String name) {
        this(name, 0.00, 0);
        System.out.println("Warning: item price and quantity has not been set, continuing with 0.00 and 0");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void restockProduct(int num) {
        this.quantity += num;
    } 

    public boolean sellProduct(int num) {
        if(this.quantity < num) { 
            return false; 
        }
        this.quantity -= num;
        return true;
    }

    public boolean getDiscountStatus() {
        return isDiscounted;
    }

    public void setDiscountStatus(double percent) {
        if(!this.isDiscounted) {
            this.price -= (this.price * percent);
            this.isDiscounted = true;
        }
    }
}