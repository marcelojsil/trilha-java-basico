package candidatura;

public class AnaliseSalarios {
    public static void main(String[] args) throws Exception {
        analisarCandidatos(1900.0);
        analisarCandidatos(2000.0);
        analisarCandidatos(2200.0);
    }

    static void analisarCandidatos (double salPretendido) {
        double salBase = 2000.0;

        if ( salBase > salPretendido) {
            System.out.println("LIGAR PARA CANDIDATO!");
        } else if ( salBase < salPretendido ) {
            System.out.println("AGUARDANDO O RESULTADO.");
        } else {
            System.out.println("LIGAR FAZENDO CONTRA PROPOSTA.");
        }
    
    }

}
