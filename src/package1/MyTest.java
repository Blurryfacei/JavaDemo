package package1;
import java.util.function.Function;
import java.util.function.UnaryOperator;
/**
 * @author huang
 */
public class MyTest<T> implements UnaryOperator<Integer>{


    @Override
    public Integer apply(Integer integer) {
        UnaryOperator<String> identity = UnaryOperator.identity();
        return null;
    }

    @Override
    public <V> Function<V, Integer> compose(Function<? super V, ? extends Integer> before) {
        return UnaryOperator.super.compose(before);
    }

    @Override
    public <V> Function<Integer, V> andThen(Function<? super Integer, ? extends V> after) {
        return UnaryOperator.super.andThen(after);
    }
}
