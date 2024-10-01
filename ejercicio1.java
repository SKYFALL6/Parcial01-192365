import java.util.Scanner;
public class ejercicio1 {

    public static void main(String[] args) {
        //colocamos el mensaje para que el usuario digite el numero
        System.out.println("Digite un numero para ver sus numeros impares desde 1");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //colocamos el ciclo que recorre el numero desde o hasta el numero que ungrese el usuario
        for (int i=0; i<=number; i++){

            //la condicion para saber si el numero es par
            if (i%2==0) {
                
              //coloque esto porque no me acorde del coso ese para colocar si era diferente de 0  
            }else{
                System.out.print(i + " ");}
      

        }
    }

}