package hw200219.Order.repo;

import hw200219.Order.Order;

public class OrderRepo {
    private static final int CAPACITY = 5;
    private Order[] orders = new Order[CAPACITY];
    private int lastOrderIndex = -1;


    public void addOrder(Order order) {
        if (lastOrderIndex == orders.length - 1) {
            Order[] newArrCountries = new Order[this.orders.length * 2];
            System.arraycopy(orders, 0, newArrCountries, 0, orders.length);
            this.orders = newArrCountries;
        }

        lastOrderIndex++;
        orders[lastOrderIndex] = order;
    }

    public Order findOrderBySerialAndNumberOfPassport(String serialAndNumberOfPassport) {
        for (Order order : orders) {
            if (order.getPerson().getSerialAndNumberOfPassport().equals(serialAndNumberOfPassport)){
                return order;
            }
        }
        return null;
    }

     
}
