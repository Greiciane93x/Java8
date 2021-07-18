package flatMap;

import java.util.List;

public class GrupoNumerico {
    private List<Integer> numeros;


    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return " GrupoNumerico{" +
                "numeros=" + numeros +
                '}';
    }
}
