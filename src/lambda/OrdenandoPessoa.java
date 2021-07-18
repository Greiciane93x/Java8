package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoPessoa {
    public static void main(String[] args) {
        System.out.println("Ordenando pessoas pelo nome");
        List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Ane", 28),
                new Pessoa("Alice", 4), new Pessoa("Bruno", 28));
        Collections.sort(listaPessoas, new Comparator<Pessoa>() {

            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return pessoa1.getNome().compareTo(pessoa2.getNome());
            }
        });
        listaPessoas.forEach(p -> System.out.println(p.getNome()));

    }
}
