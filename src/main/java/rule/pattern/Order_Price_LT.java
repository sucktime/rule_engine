package rule.pattern;

import element.Order;

/**
 * Created by Bomb on 16/2/24.
 */
public class Order_Price_LT implements Pattern<Order> {
    private float LT_Value;

    public Order_Price_LT(float LT_Value){
        this.LT_Value = LT_Value;
    }

    public boolean satisfy(Order order){
        return order.getUnitPrice() > LT_Value;
    }
}
