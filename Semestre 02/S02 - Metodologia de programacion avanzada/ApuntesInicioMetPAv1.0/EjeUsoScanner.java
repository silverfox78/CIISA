import java.util.Scanner;

public class EjUsoScanner {
	
	public static void main(String[] args) {
			 
		Scanner teclado = new Scanner(System.in);
		int ent; //Lectura de un entero
		System.out.print("\nIngrese un entero--> ");
		
		ent= teclado.nextInt();
		System.out.println("\nEl entero ingresado es: " + ent);
		
		float flo; //Lectura de un flotante
		System.out.print("\nIngrese un flotante--> ");
		flo= teclado.nextFloat();
		System.out.println("\nEl flotante ingresado es: " + flo);
		
		double dou; //Lectura de un double
		System.out.print("\nIngrese un double--> ");
		dou= teclado.nextDouble();
		System.out.println("\nEl double ingresado es: " + dou);
		
		String cad; //Lectura de un cadena
		System.out.print("\nIngrese una cadena--> ");
		cad=teclado.next();
		System.out.println("\nLa cadena ingresado es: " + cad);
		
	 	String frase;   //Al final leer un sencillo caracter
		System.out.print("\nIngrese un caracter--> ");
		frase= teclado.next(); // newline CR
		char c= frase.charAt(0);
		System.out.println("\nEl caracter ingresado es: " + c);
		
	}

}
