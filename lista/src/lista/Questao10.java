package lista;
import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double altura, pesoideal;
		
		System.out.println("Informe sua altura(em metros)");
		altura = s.nextDouble();
		pesoideal = (72*altura)-58;
		
		System.out.println("Seu peso ideal é "+ pesoideal);
	}

}
