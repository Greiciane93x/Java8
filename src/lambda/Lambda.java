package lambda;

import java.util.function.Function;

public class Lambda {

    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) ->  x*2+8;
        Integer resultado = function.apply(30);
        System.out.println(resultado);

        JButton jButton = new JButton(); 
        jButton.addActionListener(new addActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                System.out.println("Olá mundo!"); 
            }
        }); 

        // Exemplo acima com lambda 
        JButton jButton2 = new JButton(); 
        jButton2.addActionListener(e -> System.out.println("Olá mundo!"))


        // Com função lambda 
        List<Integer> asList = Arrays.asList(1,2,3,4); 
        asList.stream()
            .filter(e -> e % 2 == 0)
            .forEach(e -> System.out.println(e));
        }


        // Sem função lambda 
        List<Integer> asList2 = Arrays.asList(1,2,3,4);
        asList2.stream().filter(new Predicate<Integer>(){
            @Override 
            public boolean test(Integer e){
                return e % 2 == 0; 
            }
        }).forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer e){
                System.out.println(e); 
            }
        })
    }
}
