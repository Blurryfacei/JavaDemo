package package2;

import java.util.function.Function;

/**
 * @author huang
 */
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
    UnaryOperator<Integer> integerUnaryOperator1 = new UnaryOperator<Integer>(){
        public Integer apply(Integer t){
            return t;
        }
    };
    /**
     * Returns a unary operator that always returns its input argument.
     *
     * @param <T> the type of the input and output of the operator
     * @return a unary operator that always returns its input argument
     */
    static <T> java.util.function.UnaryOperator<T> identity() {
        return t -> t;
    }
    public static void myMethod(){
        UnaryOperator<Integer> integerUnaryOperator = new UnaryOperator<Integer>(){
            public Integer apply(Integer t){
                return t;
            }
        };

    }
}
