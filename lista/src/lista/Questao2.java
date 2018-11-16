
package lista;
import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n1, n2;
		System.out.println("Informe um número: ");
		n1 = s.nextDouble();
		System.out.println("Você deseja dividir o número"+ n1 +" por qual outro número?");
		n2 = s.nextDouble();
		
		System.out.println("Divisor: "+ n2);
		System.out.println("Dividendo: "+ n1);
		System.out.println("Quociente: "+ (n1/n2));
		System.out.println("Resto: "+ n1%n2);
		
	}

}
