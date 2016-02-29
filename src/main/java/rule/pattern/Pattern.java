package rule.pattern;

/**
 * Created by Bomb on 16/2/24.
 */
public interface Pattern<T> {
    boolean satisfy(T t);
}
