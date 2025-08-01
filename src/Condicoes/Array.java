package Condicoes;

public class    Array {
    public static void main(String[] args) {
        
        String [] ninja = new String[6] ;
        /* O Array é do tipo string pois eu quero guardar varios nomes que sao do tipo string
        Essa escrita e  a convenvional mas pode ser escrito assim : String ninja [];
        entao fica assim a primeira do igual eu estou declarando que a variavel ninja é um array abre [] nome da
        da variavel , outro lado da igualdade eu declaro new  String e coloco o tamanho dela dentro do []*/
        
        // Array sao do tipo refencia um array inteiro ele pega  um espaço a memoria e vai divindindo-se em outros espaços dentro de si mesmo
        // Voce tem que falar o tamanho dele manualmente
        
        // Para acessar o Array
        ninja[0]= "Naruto Uzumaki";
        ninja[1]= "Sasuke Uchiha";
        ninja[2]= "Sakura Haruna";
        ninja[3]= "Hinata Hyuga";
        ninja[4]= "Kakashi Hatake";
        // mostrando o array
        System.out.println(ninja[5]);// vai me mostrar a memoria que ele esta usando
        
        //Para eu  REDECLARAR  : é para eu poder mudar o nome que tem em um Vetor
        //String nomeninja = "Naruto Uzumaki";// no Caso eu estou falando que o nome mudado vai ser string , ai eu meio que dou o nome da variavel
        // e depois eu coloco que essa nova variavel é "naruto" e depois na linha de baixo eu coloco qual vai ser o valor que essa nova variavel vai receber
        
        //nomeninja ="Boruto Uzumaki"; // entao onde era o nome do naruto eu tranformo para Boruto
        //System.out.println(nomeninja);// agora o primeiro é Boruto
        
        //Redeclarar o Array
        // sempre que eu estiver redeclarando um array ele é sobreposto e nao vai existir mais
        //ele nao vai mostra mais  os dados do array passado
        // eu vou redeclarar mas entao ele nao vai ter mais esse array com essas posiçoes e ninjas vai ser todo zerado
         ninja  = new String[7];
         ninja[0] = "Hashirama senju";
         ninja[1] = "Tobirama Senju";
         ninja[2] = "Hiruze Sarutobi";
         ninja[3] = "Minato Namikaze";
         ninja[4] = "Tsunade";
         ninja[5] = "Kakashu Hatake";
         ninja[6] = "Naruto Uzumaki";
         System.out.println(ninja[2]);
         
         //FOR para fazer um loop no array
        for (int i = 0; i < 7 ; i++) {
            System.out.println(ninja[i]);
            
        }
        
        
        
        
        //Array idade
        int[] idade = new int[1];
        idade[0] = 16;
        // toda vez que eu coloco esse "new" e o tipo dela  eu estou criando um objeto de memoria
        // entao "new int []" é um novo espaço de memoria de um objeto
        System.out.println(idade); // vai me mostrar a memoria
        System.out.println(idade[2]);// Ja nesse ele vai me retornar em vez de null vai ser 0 pois o tipo do array é inteiro
        
        // e isso é para varios tipos de array
        //boolean[] verdadeiroOuFalso = new boolean[1];
        //System.out.println(verdadeiroOuFalso[0]);// vai me retornar false pois nao tem nada nessa posiçao
        System.out.println("Array.main");
    }
}
