import java.util.*;

public class Calculadora{
	public static void main (String arg[]){
		Scanner sc=new Scanner(System.in);
		
		int num1=0,num2=0,res=0,op=0;
		
		System.out.println("Calculadora");
		System.out.println("Ingrese primer numero:");
		num1=sc.nextInt();
		System.out.println("Ingrese segundo numero:");
		num2=sc.nextInt();
		
		System.out.println("Escoja la operacion:"+"\n"+"1. Suma"+"\n"+"2. Resta"+"\n"+
				"3. Multiplicacion"+"\n"+"4. Division"+"\n"+"5. Modulo");
		op=sc.nextInt();
		switch(op){
			case 1:
				res = add(num1, num2);
				break;
			case 2:
				res = restar(num1, num2);
				break;
			case 3:
				res = mul(num1, num2);
				break;
			case 4:
				res = dividir(num1, num2);
				break;
			case 5:
				res = mod(num1, num2);
				break;
		}
		System.out.println("El resultado es:" + res);
	}

	public static int add(int num1, int num2){
		return num1 + num2;
	}
	
	public static int restar(int num1, int num2){
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2){
		return num1 * num2;
	}
	
	public static int dividir(int num1, int num2){
		return num1 / num2;
	}
	
	public static int mod(int num1, int num2){
		return num1 % num2;
	}
}
