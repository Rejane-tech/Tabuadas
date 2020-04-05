package tabuada;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner (System.in);
		int num, i;
		System.out.println("Digite um numero de 1 a 10");
		num = sc.nextInt();
		
		if (num>10)
		System.out.println("Numero invalido");
		
		else {
		System.out.println("TABUADA"  + num);
		
		for (i = 1;i <= 10; i++)
		System.out.println(num +"x" + i + "=" + num * i);
		
		sc.close();
	    
		}
	
		
		}
		}
	


