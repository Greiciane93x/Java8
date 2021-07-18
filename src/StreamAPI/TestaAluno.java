package StreamAPI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

public class TestaAluno {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("ane", 28L));
        alunos.add(new Aluno("alice", 4L));
        alunos.add(new Aluno ("bruno", 28L));

        Long count = alunos.stream().count();
        System.out.println(count);

        List<String> lista = Stream.of("ane", "ane2", "ane3")
                .collect(Collectors.toList());
        System.out.println("LISTA>" + lista);

        final List<String> testandoLista = Arrays.asList("12", "13","14");
        System.out.println("TESTANDO LISTA>" + testandoLista);

        List<BigDecimal> numeros = testandoLista
                .stream()
                .map(s -> new BigDecimal(s))
                .collect(Collectors.toList());
        System.out.println("NUMEROS > " + numeros);

        List<String> iniciaisComDigitos =
                Stream.of("iwqueofqpn", "1oi2eiw", "3298749327")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(Collectors.toList());

        System.out.print("iniciando com números" + iniciaisComDigitos);
    }
}
