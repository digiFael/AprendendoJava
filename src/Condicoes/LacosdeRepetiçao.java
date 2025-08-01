package Condicoes;

public class LacosdeRepetiçao {
    public static void main(String[] args) {
        /*
         * laços de Repetiçao : Vao repetir infinitamente ou ate voce atingir o parametro desejado
         * while = for
         */
        
        //while
        //Estrututura: while (condiçao) {Tudo aqui vai acontecer}
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;
        
        /*while(numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras "+ numeroDeClones);
        }*/
        
        // For
        //
        for (int i = 1; i <= numeroMaximoDeClones ; i++) {
            System.out.println("O naruto esta se clonando e ja se clonou "+ i);
        }
        
    }
}
