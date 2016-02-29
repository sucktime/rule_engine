package rule.pattern;

import element.User;

/**
 * Created by Bomb on 16/2/24.
 */
public class User_Frequency_EQ implements Pattern<User> {
    private int EQ_Value;

    public User_Frequency_EQ(int EQ_Value){
        this.EQ_Value = EQ_Value;
    }

    public boolean satisfy(User user){
        return user.getFrequency() == EQ_Value;
    }
}
