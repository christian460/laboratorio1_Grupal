import java.util.*;

public class Calculadora{
	public static void main (String arg[]){
		int num1=0,num2=0,res=0,op=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("Ingrese primer numero:");
		num1=sc.nextInt();
		System.out.println("Ingrese segundo numero:");
		num2=sc.nextInt();
		System.out.println("Escoja la operacion:"+"\n"+"1. Suma"+"\n"+"2. Resta"+"\n"+
				"3. Multiplicacion"+"\n"+"4. Division"+"\n"+"5. Modulo");
		op=sc.nextInt();
		System.out.println("El resultado es:"+res);
	}
}
