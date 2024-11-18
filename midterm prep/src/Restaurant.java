import java.util.List;
import java.util.Map;

public class Restaurant {

    private String restaurantName;
    private List<Customer> customers;
    private Map<String, MenuItem> menuItems;

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addMenuItem(MenuItem item)
    {
        if (item instanceof Dish)
            menuItems.put(item.getName(), item);
        else if (item instanceof Drink)
            menuItems.put(item.getName(), item);
    }

    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId))
                return customer;
        }
        return null;
    }

    public void displayMenu() {
        for (MenuItem menuItem : menuItems.values()) {
            System.out.println(menuItem + " " + menuItem.getDescription() );
        }
    }

    private double calculateTotalSales()
    {
        // bukvalno ne moze ni na jedan nacin ??
    }
}
