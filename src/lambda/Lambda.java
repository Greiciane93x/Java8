package lambda;

import java.util.function.Function;

public class Lambda {

    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) ->  x*2+8;
        Integer resultado = function.apply(30);
        System.out.println(resultado);
    }
}
