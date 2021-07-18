package flatMap;

import java.util.Arrays;
import java.util.List;

public class ListaGrupoNumerico {
    public static void main(String[] args) {
        final GrupoNumerico multiploDe2 = new GrupoNumerico();
        multiploDe2.setNumeros(Arrays.asList(0,2,4,6));

        final GrupoNumerico multiploDe3 = new GrupoNumerico();
        multiploDe3.setNumeros(Arrays.asList(0,3,6,9,12));

        final GrupoNumerico multiploDe4 = new GrupoNumerico();
        multiploDe4.setNumeros(Arrays.asList(4,8,12,16));

        System.out.println("MULTIPLO DE 2" + multiploDe2);

        System.out.println("MULTIPLO DE 3" + multiploDe3);

        System.out.println("MULTIPLO DE 4" + multiploDe4);




    }
}
