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
		switch(op){
			case 1:
				res=1;
			case 2:
				restar(num1,num2);
			case 3:
				res=3;
			case 4:
				res=4;
			case 5:
				res=5;
		}
		System.out.println("El resultado es:"+res);
	}
	public int restar(int num1,int num2){
		return a-b;
	}
}
