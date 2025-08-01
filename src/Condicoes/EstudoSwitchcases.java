package Condicoes;

import java.util.Scanner;

public class EstudoSwitchcases {
public static void main(String[] args) {
    /*
     *SwitchCase: que servem para gerar casos especificos
     * Objetivos: Usuario vai escolher qual personagem ele vai escolher
     *Switch cases
     */
     
    //Pedir para o Usuario
    Scanner scanner = new Scanner(System.in); // Eu estou chamando a propriedade Scanner e nomeando e iniciando ela
    
    //Mostrar opçoes para o Usuario
    System.out.println("Escolha um personagem: ");
    System.out.println("1-Naruto Uzumaki");
    System.out.println("2-Sasuke Uchiha");
    System.out.println("3-Sakura Haruno");
    
    //Pedir para o usuario escolher uma das opçoes
    int escolhaDoUsuario = scanner.nextInt(); // Criando variavel com esse nome e que vai armazenar um numero inteiro e na variavel scanner
    
    System.out.println("Voce digitou o numero : " + escolhaDoUsuario);// Mostrar a opçao escolhida
    
    //Reaçao ao escolher um personagem
    switch (escolhaDoUsuario){
        case 1 :
            System.out.println("O Usuario escoheu o Naruto Uzumaki");
            break;
        case 2 :
            System.out.println("O Usuario escoheu o Sasuke o ninja mais revoltado");
            break;
        case 3 :
            System.out.println("O Usuario escoheu a Sakura Haruno, a personagem feminina mais legal. ");
            break;
        default:
            System.out.println("Você nao digitou uma resposta valida! tente denovo");
    }
    
    
    //fechar a caixa
    scanner.close();
    }

}
