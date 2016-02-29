package element;

/**
 * Created by Bomb on 16/2/24.
 */
public class User {
    private int cityNO;
    private int type;// worker or stu
    private int frequency; //num of order submition
    private long uid;

    public int getCityNO() {
        return cityNO;
    }

    public void setCityNO(int cityNO) {
        this.cityNO = cityNO;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
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

        User user = (User) o;

        if (cityNO != user.cityNO) return false;
        if (type != user.type) return false;
        if (frequency != user.frequency) return false;
        return uid == user.uid;

    }

    @Override
    public int hashCode() {
        int result = cityNO;
        result = 31 * result + type;
        result = 31 * result + frequency;
        result = 31 * result + (int) (uid ^ (uid >>> 32));
        return result;
    }
}
