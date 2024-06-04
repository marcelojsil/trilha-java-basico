package others;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //crias as vairaveis como nome,agencia,saldo pra receber os valores  e cria um if e else caso n
        //coloca as informação devidas e então poder sair do programa
        //fazer uma solicitação de saldo
        /*solicita um double de 25 no saldo*/
        String info = "[ENTER]";

        System.out.println("Digite sua Agência !");
        System.out.println("Agência: " + info);
        int agencia = scanner.nextInt();
        

        System.out.println("Nome: " + info);
        String nomeCliente = scanner.next();

        System.out.println("Conta: " + info );
        String conta = scanner.next();

        System.out.println("Saldo: " + info);
        double saldo= scanner.nextDouble();


        /*imprimi usando concatenar
        * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia]
        * , conta [Numero] e seu saldo [Saldo] já está disponível para saque".*/

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "+ agencia +", conta " + conta + " e seu saldo "+ saldo + " já está disponível para saque.");
    }
}



