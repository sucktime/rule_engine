package rule.pattern;

import element.Order;
import element.User;

/**
 * Created by Bomb on 16/2/24.
 */
public class Order_User_Join_EQ implements JoinPattern<Order,User> {

    public boolean satisfy(Order order, User user){
        return order.getUid() == user.getUid();
    }
}
