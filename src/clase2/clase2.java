package clase2;

import java.util.Scanner;

public class clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		float main;
		int num1;
		int num2;
		int resultado;
		int edad;//EJERCICIO NIÑA BONITA
		
		GuiaIf.ejercicio1();
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("ingrese un numero");
		
		num1 = Integer.parseInt(s.nextLine());
		
			
		System.out.println("ingrese otro numero");
		
		num2 = Integer.parseInt(s.nextLine());
		//EJERCICIO NIÑA BONITA
		
		System.out.println("ingrese su edad");
		Scanner e= new Scanner(System.in);
				edad = Integer.parseInt(s.nextLine());
				
		
			
		
		
		
		//EL USURIO NO PODRA PONER 0 PARA DIVIDIR LA OPERACION (CONDICIONAL)
		
		
		if (num2!= 0)	
			if (edad==15)
		{
			
			resultado = num1 / num2;
			System.out.println("El resultado es: ");
		}
		else
		{
			System.out.println("No se puede dividir por 0");
		}

	}
}