package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos");
		String apellidos = sc.nextLine();
		System.out.println("TUS DATOS: "+nombre+" "+apellidos);
		
		
		sc.close();
		
		
	}

}
