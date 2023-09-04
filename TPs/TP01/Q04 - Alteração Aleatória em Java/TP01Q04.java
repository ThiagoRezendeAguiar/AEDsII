import java.util.Random;

class TP01Q04 {
  public static String alteracao(String texto, char caracter, char caracterTrocar) {
    String aleatorio = "";

    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == caracter) {
        aleatorio += caracterTrocar;
      } else {
        aleatorio += texto.charAt(i);
      }
    }

    return aleatorio;
  }

  public static void main(String[] args) {
    Random gerador = new Random();
    gerador.setSeed(4);

    String texto = MyIO.readLine();

    while (stop(texto)) {
      char caracter = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
      char caracterTrocar = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
      MyIO.println(alteracao(texto, caracter, caracterTrocar));
      texto = MyIO.readLine();
    }
  }

  public static boolean stop(String texto) {
    boolean resp = true;
    if (texto.charAt(0) == 'F' && texto.charAt(1) == 'I' && texto.charAt(2) == 'M') {
      resp = false;
    }
    return resp;
  }
}