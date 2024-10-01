import java.util.Scanner;

public class ejercicio2 {
public static void main(String[] args) {
    System.out.println("Escribe una palabra");
    Scanner scan = new Scanner(System.in);
    String texto = scan.nextLine();

    char[] caracteres = texto.toCharArray();

    for (int i = 1; i <=texto.length() ; i++)


    if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' ||
    caracteres[i] == 'o' || caracteres[i] == 'u' ||
    caracteres[i] == 'A' || caracteres[i] == 'E' || caracteres[i] == 'I' ||
    caracteres[i] == 'O' || caracteres[i] == 'U') {
    caracteres[i] = 8 ; // Reemplazar la vocal por el símbolo
}
System.out.println(String.valueOf(caracteres));
}


}
