package candidatura;
//importa sistema que cria valores aleatórios
import java.util.concurrent.ThreadLocalRandom; 

public class ProcessoSeletivo {
    //os registros que aparecerão na tela
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MARCIA","CLAUDIO","RAFAEL","EDMILSON","CESAR","THENILI","VICTOR","PIETRO","THUANE"};
        
        int candidatosSelecionados = 0; //inicia do zero
        int candidatoAtual = 0; //inicia do zero
        double salBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato  = candidatos[candidatoAtual];
            double salPretendido = valorPretendido();

            System.out.println("Candidato "+candidato+" pretende salário de "+salPretendido);
            if(salBase >= salPretendido){
                System.out.println("Candidato "+candidato+" selecionado!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    
    }

    //gera valor aleatório
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);    
    }

}
