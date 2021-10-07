import java.util.Arrays; 
import java.util.List; 
import java.util.Locale; 

public class Java8Streams {


    public static void main(String[] args){
        List<Integer> lista = Arrays.asList(1,2,3,4,7,8,9); 

        List<String> listaNomes = Arrays.asList("AXC", "XCA", "CAX"); 
        lista.stream()
             .skip(2) // operação intermediária 
             .forEach(e -> System.out.println(e)); // operação final  
                
        lista.stream()
             .limit(4)
             .forEach(e -> System.out.println(e))

        lista.stream()
            .distinct()
            .forEach(e -> Sytem.out.println(e));  // não permite elementos repetidos 
        
        lista.stream()
            .skip(2) // pulando os dois primeiros numeros 
            .limit(3) // processa até o terceiro
            .forEach(e -> System.out.println(e)); 

        lista.stream()
            .filter(e -> e % 2 == 0)
            .forEach(e -> System.out.println(e))
        
        lista.stream()
            .map(e -> e * 2)
            .forEach(e -> System.out.prinln(e)); 

    // ---------------------

    listaNomes.stream( 
        .map(e ->  e.concat("- XXX"))
        .map(e -> e.toLowerCase(Locale.ROOT)) // lista original nao é modificada
        .forEach(e -> System.out.prinln(e))
    )
        
     // -----------------------
        Path dictionary = Paths.get(args[0]); 
        int minGroupSize = Integer.parseInt(arg[1]); 
        try(Stream<String> words = Files.lines(dictionary)){
            words.collect(groupingBy(word -> alphabetize(word)) 
                          .values().stream()
                          .filter(group -> group.size() >= minGroupSize) 
                          .forEach(g -> System.out.println(g.size() + ":" + g)); 
        }     
     }
   }                      
}
