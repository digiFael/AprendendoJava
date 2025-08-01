package Condicoes;

public class ifEelse {
    public static void main(String[] args) {
        /*
        If e Else - Condiçoes
        else if
        Objetivo : passa o ninja de nivel de acordo com o numero de missoes
         */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean  hokege = false;
        short numeroDeMissoes = 20;// esse short eu trabalho com numero so que numeros menores
        /*
        *if (condiçao){resultado}
        * else if (condiçao){resultado}
        * else{resultado caso nada seja verdadeiro
         */

        //se(condiçao) {Faça isso}
        if ( numeroDeMissoes == 10 && idade > 15 ){
            System.out.println("Rank: Chunnin");

        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank : Jounin");
        } else{
            System.out.println("Rank : Gennim" );
        }
        
        
    }
}
