package lambda;

import java.util.Arrays;
import java.util.List;

public class ImprimeValores {
    public static void main(String[] args) {
        System.out.println("Imprimindo valores da lista");
//        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        for(Integer n : lista){
//            System.out.println(n);
//        }
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
        lista.forEach(n -> System.out.println(n));

    // Apenas pares

        lista.forEach(n -> {
                    if( n % 2 == 0){
                        System.out.println(n);
                    }
        });
        // Multiplicando valores
        List<Integer> multiplicaLista = Arrays.asList(1,2,3,4,5,6,7,8);
        multiplicaLista.forEach(n -> System.out.println( n * n ));
    }
}
