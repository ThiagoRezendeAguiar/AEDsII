
public class TP01Q06 {
  public static void main(String[] args) {
	  String texto = MyIO.readLine();
	  
	  while (stop(texto)) {
          if (isVogal(texto) == true) {
              MyIO.print("SIM ");
          } else {
              MyIO.print("NAO ");
          }
          if (isConsoante(texto) == true) {
              MyIO.print("SIM ");
          } else {
              MyIO.print("NAO ");
          }
          if (isInt(texto) == true) {
              MyIO.print("SIM ");
          } else {
              MyIO.print("NAO ");
          }
          if (isReal(texto) == true) {
              MyIO.println("SIM ");
          } else {
              MyIO.println("NAO ");
          }
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
  
  public static boolean vogal(char x) {
	  boolean resp = false;
	  if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'|| x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' ) {
		  resp = true;
	  }
	  return resp;
  }
  
  public static boolean isVogal(String texto) {
	  boolean resp = true;
	  
	  for(int i = 0; i < texto.length(); i++) {
		  if(vogal(texto.charAt(i)) == false){
			  resp = false;
		  }
	  }
	  
	  return resp;
  }
  
  public static boolean isConsoante(String texto) {
	  boolean resp = true;
	  
	  for(int i = 0; i < texto.length(); i++) {
		  if((vogal(texto.charAt(i)) == true) || (texto.charAt(i) >= '0' && texto.charAt(i) <= '9')){
			  resp = false;
		  }
	  }
	  
	  return resp;
  }
  
  public static boolean isInt(String texto) {
	  boolean resp = true;
	  
	  for(int i = 0; i < texto.length(); i++) {
		  if(!(texto.charAt(i) >= '0' && texto.charAt(i) <= '9')) {
			  resp = false;
		  }
	  }
	  
	  return resp;
  }
  
  
  public static boolean isReal(String texto) {
	  boolean resp = true;
	  int n = 0;
	  
	  for(int i = 0; i < texto.length(); i++) {
		  if(texto.charAt(i) == '.' || texto.charAt(i) == ',') {
			  n++;
		  }
		  else if(!(texto.charAt(i) >= '0' && texto.charAt(i) <= '9')) {
			  resp = false;
		  }
	  }
	  
	  if(n > 1) {
		  resp = false;
	  }
	  
	  return resp;
  }
}
