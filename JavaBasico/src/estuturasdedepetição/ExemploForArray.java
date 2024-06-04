package estuturasdedepetição;
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) {
            int xReal = x+1;
            System.out.println("O aluno no indice x=" + xReal + " é " + alunos[x]);
        }
    
    }
}