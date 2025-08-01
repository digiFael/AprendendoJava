package Condicoes;

import javax.lang.model.SourceVersion;

public class ArrayMultidimensional2D {
    public static void main(String[] args) {
      /*
      Array 2d :Vai ser um Array que vai levar outro array dentro
      * Vc vai precissar colocar dois[][] para especificar o tamanho do array
      *Ex: Array[3][3]
      isso sgnifica que eu vou ter um array como "referencia" entao pensando nos indices do primeiro array
      ninja[0]= naruto
      ninja[1]= sasuke
      ninja[3] = sakura
      
      esse arrray vai ser referencia como eu estou abrindo um array [3][3]
      entao ele o naruto vai ser a referencia desse novo1array
      sasuke vai ser a referencia do novo2array
      sakura vai ser a referencia do novo3array
      
      é como se fosse uma matriz
      
       */
        String[][] ninjasEaAldeia = new String[3][3];
        ninjasEaAldeia [0][0] ="Konaha";
        /*O primeiro [] referece a linha e a segunda [] refere a coluna
         nesse caso eu estou falando do elemento que esta na linha 0 e coluna 0 lembre-se que array começa no 0 mesmo
        */
        ninjasEaAldeia[0][1]="Naruto Uzumaki"; // linha 0 coluna 1
        
        ninjasEaAldeia[0][2]="Sasuke Uchiha";// linha 0 coluna 2
        
        ninjasEaAldeia[1][0]="Nevoa"; // linha 1 coluna 0
        ninjasEaAldeia[1][1]="Zabusa"; //linha 1 coluna 1
        ninjasEaAldeia[1][2]="Haku"; // linha 1 coluna 2
        
        ninjasEaAldeia[2][0]="Deserto"; //
        ninjasEaAldeia[2][1]="Gaara"; //
        ninjasEaAldeia[2][2]="Temari"; //
        
        System.out.println(ninjasEaAldeia[0][1]); // nesse caso eu estou pegando so um espaço do array e printando 
        
        for (int i = 0; i < ninjasEaAldeia.length; i++) {
            System.out.println(ninjasEaAldeia[i][1]);// nesse eu estou pefindo para ele me dar todos que estao na coluna 1 inependente da posiçao
            System.out.println("Aldeia: " + ninjasEaAldeia[i][0] + " - Ninja 1: " + ninjasEaAldeia[i][1] + " - Ninja 2: " + ninjasEaAldeia[i][2]);
            
        }
        
        // Array 2d: Array que vai levar outro array dentro
    
    
    }
}
