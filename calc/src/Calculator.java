import java.util.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> {return x + y;};
    BinaryOperator<Integer> minus = (x, y) -> {return x - y;};
    BinaryOperator<Integer> multiply = (x, y) -> {return x * y;};
    BinaryOperator<Double> devide = (x, y) -> {return x / y;};   //Double, если оставить Integer - будет считаться ошибкой, тк при делении редко получается целое число
    UnaryOperator<Integer> pow = x -> {return x * x;};
    UnaryOperator<Integer> abs = x -> {if (x>0) return x 
        else if (x<0) return -1*x
            else return 0;};                    // данный блок, как и инструкцию предыдущей версии необходимо заключить в фигурные скобочки.
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
