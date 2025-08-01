package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        Ternario : sao maneiras para reduzir o codigos
        * Estrutura: variavel = (condiçao) ? valorSeverdadeiro : valorSeFalso;
        **/
        
        short numerodeMissoes = 2; // esse short seria igual um int so que armazena menos numeros
        String  niveldoNinja = (numerodeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        /* Esse string e dizendo que nivel e do tipo String
        parentes : condiçao
        ? é para dizer que o que esta na frente do ? é para ser feito caso a condiçao seja verdadeira
        : é para dizer que o que esta na frete dos : é para ser feito caso a condiçao seja falsa
         */
        // para mostrar  a funçao ternario
        System.out.println(niveldoNinja);
    }
}
