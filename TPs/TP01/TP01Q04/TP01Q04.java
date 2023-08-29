import java.util.Random;

class TP01Q04{
  public static String alteracao(String texto, Random gerador){
    char caracter = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
    char caracterTrocar = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
    int n = texto.length();
    String aleatorio =  new String();
    
    for(int i = 0; i < n; i++){
      if(texto.charAt(i) == caracter){
        aleatorio += caracter;
      }
      else{
         aleatorio += texto.charAt(i);
      }
    } 

    return aleatorio;
  } 
  
  public static void main(String[] args){
    Random gerador = new Random();
    gerador.setSeed(4);
    
    String texto = MyIO.readLine();
    
    while(stop(texto)){
      MyIO.println(alteracao(texto,gerador));
      texto = MyIO.readLine();
    }
  }

 public static boolean stop(String texto){
           boolean resp = true;
           if (texto.charAt(0) == 'F' && texto.charAt(1) == 'I' && texto.charAt(2) == 'M'){
                resp = false;
           }
           return resp;
    }
}