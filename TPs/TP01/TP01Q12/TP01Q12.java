class TP01Q12{
  public static String ciframento(String texto, int i){
    String cifrado = new String();
    int chave = 3, n = texto.length();
    
    if(i == n - 1){
      cifrado += (char)(texto.charAt(i) + chave);
    }
    else {
      cifrado += ((char)(texto.charAt(i) + chave)) + ciframento(texto, i+1);
    }
  
    return cifrado;
  }

  public static void main(String[] args){
    String texto = MyIO.readLine();
    
    while(stop(texto)){
      MyIO.println(ciframento(texto, 0));
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