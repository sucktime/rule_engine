package rule.pattern;

import element.Order;

/**
 * Created by Bomb on 16/2/24.
 */
public class Order_RestaurantId_EQ implements Pattern<Order> {
    private long EQ_Value;

    public Order_RestaurantId_EQ(long EQ_Value){
        this.EQ_Value = EQ_Value;
    }

    public boolean satisfy(Order order){
        return order.getRestaurantId() == EQ_Value;
    }
}
