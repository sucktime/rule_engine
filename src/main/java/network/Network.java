package network;

import element.Order;
import element.User;
import rule.pattern.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bomb on 16/2/24.
 */
public class Network {
    public static final Map<Class,Object> ENTRANT_MAP = new HashMap<Class, Object>(20);
    {
        /* init network struct: */
        SingleInputNode currentNode = new SingleInputNode(new Order_Price_LT(0));
        ENTRANT_MAP.put(Order.class, currentNode);
        DoubleInputNode doubleInputNode = new DoubleInputNode(new Order_User_Join_EQ());
        currentNode.addNextNode(doubleInputNode);
        SingleInputNode successNode = new SingleInputNode(new Order_FoodId_EQ(1001));
        currentNode.addNextNode(successNode);
        currentNode = successNode;
        successNode = new SingleInputNode(new Order_RestaurantId_EQ(10001));
        currentNode.addNextNode(successNode);

        currentNode = new SingleInputNode(new User_Frequency_EQ(0));
        ENTRANT_MAP.put(User.class, currentNode);
        currentNode.addNextNode(doubleInputNode);

        /* add intial elements/objects */

    }
}
