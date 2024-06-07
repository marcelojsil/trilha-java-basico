package candidatura;

public class ImprimirLista {

    public static void main(String[] args) {
        imprimirSelecionados();
    }
    
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MARCIA","CLAUDIO","RAFAEL","EDMILSON"};
        System.out.println("Informando o indíce do elemento");
        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("Candidato nº "+(indice+1)+" é o "+candidatos[indice]);
        }

        System.out.println("Forma abreviada!");
        for(String candidato: candidatos){
            System.out.println("Candidato selecionado é "+candidato);
        }
    }


}
