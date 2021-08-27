package Optional;

import java.util.Optional;

public class ConsultaCobertura {
    public static void main(String[] args) {
        Motoristas motoristas = new Motoristas();
//        Motorista motorista = motoristas.porNome("José");

        //String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
//
//        String cobertura = "Sem seguro";
//        if(motorista != null){
//            Caminhao caminhao = motorista.getCaminhao();
//            if(caminhao != null){
//               3 Seguro seguro = caminhao.getSeguro();
//                if(seguro != null){
//                    cobertura = seguro.getCobertura();
//                }
//            }
//        }
//        System.out.println("A cobertura é: "+ cobertura);


        String coberturaOpcional = motoristas.porNome("José")
                .flatMap(Motorista::getCaminhao)
                .flatMap(Caminhao::getSeguro)
                .map(Seguro::getCobertura)
                .orElse("Sem cobertura");

        System.out.println("A cobertura é: " + coberturaOpcional);
        //Optional<Motorista> motoristaOpcional = motoristas.porNome("João");
        //Optional<Caminhao> caminhaoOpcional = motoristaOpcional.flatMap(Motorista :: getCaminhao);
    }
}
