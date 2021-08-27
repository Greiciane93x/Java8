package filter; 

public class testFilter {

   public static void main(String[] args) {
       List<String> testForFilter = Arrays.asList("GEQ", "EQG", "QGE"); 
       
        List<String> result = testForFilter.stream()
        .filter(e -> "GEQ".equals(result))
        .collect(Collectors.toList()); 

        result.forEach(System.out::println); 

   }
}