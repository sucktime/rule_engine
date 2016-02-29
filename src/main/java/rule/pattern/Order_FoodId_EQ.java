package rule.pattern;

import element.Order;

/**
 * Created by Bomb on 16/2/24.
 */
public class Order_FoodId_EQ implements Pattern<Order> {
    private int EQ_Value;

    public Order_FoodId_EQ(int EQ_Value){
        this.EQ_Value = EQ_Value;
    }

    public boolean satisfy(Order order){
        return order.getFoodId() == EQ_Value;
    }
}
