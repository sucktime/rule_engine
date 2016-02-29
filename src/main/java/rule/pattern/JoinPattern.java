package rule.pattern;

/**
 * Created by Bomb on 16/2/24.
 */
public interface JoinPattern<A,B> {
    boolean satisfy(A a, B b);
}
