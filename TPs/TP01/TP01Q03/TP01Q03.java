class TP01Q03{
  public static String ciframento(String texto){
    String cifrado = new String();
    int chave = 3, n = texto.length();
    
    for(int i = 0; i < n; i++){
      cifrado += (char)(texto.charAt(i) + chave);
    }

    return cifrado;
  }

  public static void main(String[] args){
    String texto = MyIO.readLine();
    
    while(stop(texto)){
      MyIO.println(ciframento(texto));
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