package lista;
import java.util.Scanner;
public class Questao9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2; double n, c1, c2, c3;
		
		System.out.println("Informe um número(INTEIRO)");
		n1 = s.nextInt();
		System.out.println("Informe outro número(INTEIRO)");
		n2 = s.nextInt();
		System.out.println("Informe mais um número(REAL)");
		n = s.nextDouble();
		c1=(n1*2)/(n2/2);
		c2=(n1*3)+n;
		c3=Math.pow(n, 3);
		System.out.println("A) "+ c1);
		System.out.println("B) "+ c2);
		System.out.println("C) "+ c3);

	}

}
