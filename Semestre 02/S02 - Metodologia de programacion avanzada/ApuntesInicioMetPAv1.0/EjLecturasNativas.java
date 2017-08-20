import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjLecturas {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(isr);
								
		int ent; //Lectura de un entero
		System.out.print("\nIngrese un entero--> ");
		ent=Integer.parseInt(entrada.readLine());
		System.out.println("\nEl entero ingresado es: " + ent);
		
		float flo; //Lectura de un flotante
		System.out.print("\nIngrese un flotante--> ");
		flo=Float.parseFloat(entrada.readLine());
		System.out.println("\nEl flotante ingresado es: " + flo);
		
		double dou; //Lectura de un double
		System.out.print("\nIngrese un double--> ");
		dou=Double.parseDouble(entrada.readLine());
		System.out.println("\nEl double ingresado es: " + dou);
		
		String cad; //Lectura de un cadena
		System.out.print("\nIngrese una cadena--> ");
		cad=(entrada.readLine());
		System.out.println("\nLa cadena ingresado es: " + cad);
		
		char c;   //Al final leer un sencillo caracter
		System.out.print("\nIngrese un caracter--> ");
		c= (char) (System.in.read());
		 // Lectura CRLF posterior
		System.in.read(); 
		System.in.read();
		System.out.println("\nEl caracter ingresado es: " + c);
						
	}

}
