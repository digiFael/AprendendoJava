package Condicoes;
import java.util.Scanner; // Automaticamente quando eu coloco o Scanner ele ja importa essa biblioteca de Scanear

public class Scanners {
    public static void main(String[] args) {
        /*
         *Scaner = É um jeito d trazer o usuario para dentro da aplicaçao
         * Objetivo : o Usuario que vai criar o ninja
         */

        //Abrir o Scanner e dar o nome para ele
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escreva aqui o nome do ninja:"); //Print normal
        String nomeNinja = caixaDeTexto.nextLine();//Coloco o objeto(caixadetexto para receber o nomeNinja e coloco metodo para receber uma string

        // aqui eu estou printando o que foi informado
        System.out.println("O nome do ninja é : " + nomeNinja);

    
        //Receber a idade do ninja
        System.out.println("Escreva aqui a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt(); // Entao eu posso usar varias vezes o mesmo Scanner que foi aberto . Metodo para inteiro
        System.out.println("A idade do ninja é :" + idadeDoNinja);

        // Tratamento de dados
        if(idadeDoNinja >= 18){
            System.out.println("Esse ninja é maior de idade e pode ir para missoes fora da aldeia");
        }else{
            System.out.println("Esse ninja é muito novo ainda");
    
        }


        caixaDeTexto.close(); // Aqui eu estou fechando o Scanner

    }


}
