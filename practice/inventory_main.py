from inventory_tracker import InventoryTracker as tracker

def get_result(result: bool) -> str:
    if result:
        return 'Success!'
    return 'Error: Not enough stock!'

if __name__ == '__main__':
    products: tracker[3] = [
        tracker('Laptop', 2299.0, 20),
        tracker('Phone', 899.0, 35),
        tracker('Headphones', 129.0, 15)
    ]

    sell: int = 5
    index: int = 0
    while True:
        print(f'Product: {products[index].get_name()}, | Price: ${products[index].get_price():.2f}, | Stock: {products[index].get_quantity()}')
        print(f'Selling {sell} {products[index].get_name()}s... {get_result(products[index].sell_product(sell))}')
        if products[index].get_price() > 500 and not products[index].get_discount_status():
            print(f'High-value item detected. Applying 10{"%"} discount! New Value: ', end= '')
            products[index].set_discount_status(0.1)
            print(f'{products[index].get_price()}')
        elif products[index].get_quantity() <= 3:
            print(f'Low stock alert! Restocking 10 units of {products[index].get_name()}s. New stock: ', end= '')
            products[index].restock_product(10)
            print(f'{products[index].get_quantity()}')
        index += 1
        if index == 3:
            input()
            index = 0