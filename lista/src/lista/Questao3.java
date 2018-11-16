
package lista;
import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double horas, salario, shora;
		System.out.println("Quantas horas você trabalhou neste mês?");
		horas = s.nextDouble();
		System.out.println("Quanto você recebe por hora?");
		shora = s.nextDouble();
		
		salario = horas * shora;
		
		System.out.println("VocÊ irá receber "+ salario+" neste mês.");
	}

}
