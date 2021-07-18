package Optional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Motoristas {

    private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
    public Motoristas(){
        Seguro seguro = new Seguro("Parcial - ñ cobre roubo", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Mercedes", Optional.ofNullable(seguro));

        Optional<Motorista> motoristaAne = Optional.of(new Motorista("Ane",28, Optional.ofNullable(caminhao)));
        Optional<Motorista> motoristaBruno = Optional.of(new Motorista("Bruno", 28, Optional.ofNullable(null)));

        motoristas.put("Ane", motoristaAne);
        motoristas.put("Bruno", motoristaBruno);
    }
    public Optional<Motorista> porNome(String nome){
        return motoristas.get(nome);
    }
}
