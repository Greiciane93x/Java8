import java.util.Arrays; 
import java.util.List; 
import java.util.Locale; 

public class Java8Streams {


    public static void main(String[] args){
        List<Integer> lista = Arrays.asList(1,2,3,4,7,8,9); 

        lista.stream()
             .skip(2)
             .forEach(e -> System.out.println(e)); 
                

        lista.stream()
             .limit(4)
             .forEach(e -> System.out.println(e))

        lista.stream()
            .distinct()
            .forEach(e -> Sytem.out.println(e)); 
        )
    }

}