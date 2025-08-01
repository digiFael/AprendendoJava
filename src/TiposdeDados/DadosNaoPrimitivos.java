package TiposdeDados;

import java.sql.SQLOutput;
import java.util.Locale;

public class DadosNaoPrimitivos { //ai eu preciso declarar essa classe que eu abri entao eu vou usar o comando public static void main(String[] args) ou pode usar o atalho "psvm"
    public static void main(String[] args) {
        //Tudo que for digitado aqui dentro com o comando PSVM  vai ser compilado pelo Java
        /* Dados nao primitivos : string, array , class, enum (podem chamar de tipo de referencia pois tem alocar na memoria )
        Objetivo: Criar um ninja,e atribuir metodos a ele.

         */
        String nome  = "Naruto Uzumaki"; // aqui eu estou declarando nome como string  Aqui eu estou usando letra maiuscula so no N e no U
        String nomeUpperCase= nome.toUpperCase();// ToUpperCase ele coloca tudo em Capslock ele vai tranformar a variavel "nome" toda no formato de CAPSLOCK
        System.out.println(nome);// aqui eu estou chamando somente a variavel nome mas o primeiro nome , para colocar a funçao

        //que eu defini eu preciso colocar outro nome "nomeUpperCase" para essa variavel de nome.toUpperCase() , è como se eu tivesse que declarar outra metodo que aquela variavel vai ter que ter
        System.out.println(nomeUpperCase); // Aqui eu ja mostro o Nome todo em caps lock

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase =  aldeia.toLowerCase(); // tolowerCase ele deixa tudo em caixa baixa minusculo
        System.out.println(aldeiaLowerCase);
    }
}
