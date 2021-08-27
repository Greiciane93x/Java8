package Optional;

import java.math.BigDecimal;
import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args) {
        Seguro seguro = new Seguro("Total com franquia reduzido", new BigDecimal("600"));

        Optional<Seguro> seguroOptional = Optional.of(seguro);

        seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);


    }
}
