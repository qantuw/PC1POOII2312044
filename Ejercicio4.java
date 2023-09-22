package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		System.out.println("Tirando los dados..." );
	char respuestaUsuario;
	do {
   
   int dado1=random.nextInt(6) +1;
   
   int dado2=random.nextInt(6) +1;
   
   System.out.println("Sus valores son:" + dado1 );
   System.out.println("Sus valores son:" + dado2 );
   
   System.out.println("¿Desea volver a tirar los dados?: (y/n):");
   respuestaUsuario= scanner.next().charAt(0);
	} while (respuestaUsuario == 'y'|| respuestaUsuario == 'Y');
	System.out.println ("Gracias por jugar!");
	
	}

}
