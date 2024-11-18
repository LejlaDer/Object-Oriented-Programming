import java.util.Date;
import java.util.HashMap;

public class TableReservation<T extends MenuItem & Billable> {
    private String reservationId;
    private Date reservationDate;
    private HashMap<T, Integer> orderedItems; //A map of items and their quantities ordered during the reservation.
    private int tableNumber;

    public TableReservation(String reservationId, Date reservationDate, int tableNumber) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.tableNumber = tableNumber;
    }

    public void addItemToOrder(T item, int quantity)
    {
        orderedItems.put(item, quantity);
    }

    public double calculateTotalAmount()
    {
        double total = 0.0;

        for (T item : orderedItems.keySet()) {
            int quantity = orderedItems.get(item);
            double price = item.applyDiscount();
            total += quantity * price;
        }

        return total;
    }
}
