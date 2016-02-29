package element;

/**
 * Created by Bomb on 16/2/24.
 */
public class Order {
    private int foodId;
    private float unitPrice;
    private long restaurantId;
    private long uid;

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (foodId != order.foodId) return false;
        if (Float.compare(order.unitPrice, unitPrice) != 0) return false;
        if (restaurantId != order.restaurantId) return false;
        return uid == order.uid;

    }

    @Override
    public int hashCode() {
        int result = foodId;
        result = 31 * result + (unitPrice != +0.0f ? Float.floatToIntBits(unitPrice) : 0);
        result = 31 * result + (int) (restaurantId ^ (restaurantId >>> 32));
        result = 31 * result + (int) (uid ^ (uid >>> 32));
        return result;
    }
}
