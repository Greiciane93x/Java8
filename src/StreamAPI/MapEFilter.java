package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEFilter {

    public static void main(String[] args) {

        List<String> numeros = Arrays.asList("100", "101", "102", "103");
        List<Integer> numerosPares = numeros
                .stream()
                .map(n -> new Integer(n))
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.print(numerosPares);
    }
}