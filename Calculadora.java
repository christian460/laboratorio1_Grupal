import java.util.*;

public class Calculadora{
	public static void main (String arg[]){
		int num1=0,num2=0,res=0,op=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("Ingrese primer numero:");
		num1=nextInt();
		System.out.println("Ingrese segundo numero:");
		num2=nextInt();
		System.out.println("Escoja la operacion:
				1. Suma
				2. Resta
				3. Multiplicacion
				4. Division
				5. Modulo");
		op=nextInt();
	}
}
