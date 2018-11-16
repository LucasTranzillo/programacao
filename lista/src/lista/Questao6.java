package lista;
import java.util.Scanner;
public class Questao6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double saldo1, saldofinal;
		
		System.out.println("Informe o saldo atual da sua caderneta: ");
		saldo1 = s.nextDouble();
		
		saldofinal=(saldo1+(saldo1*3/100));
				
				System.out.println("O seu saldo teve um reajuste de 3% e agora é de "+ saldofinal);
				
				s.close();

	}

}
