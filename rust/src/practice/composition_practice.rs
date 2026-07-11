struct Product {
    name: String,
    price: f64,
}

struct InventoryItem {
    product: Product,
    quantity: u32,
}

impl InventoryItem {
    fn new(name: &str, price: f64, quantity: u32) -> Self {
        Self {
            product: Product {
                name: name.to_string(),
                price: price,
            },
            quantity: quantity,
        }
    }

    fn restock(&mut self, amount: u32) {
        self.quantity += amount;
    }

    fn total_value(&self) -> f64 {
        self.product.price * (self.quantity as f64)
    }
}

fn main() {
    let mut item_1: InventoryItem = InventoryItem::new("Laptop", 999.99, 5);
    println!("Total value of {} is {}.", item_1.product.name, item_1.total_value());
    InventoryItem::restock(&mut item_1, 3);
    println!("Total value of {} is {}.", item_1.product.name, item_1.total_value());
}