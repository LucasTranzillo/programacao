package lista;
import java.util.Scanner;
public class Questao5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double f, c;
		
		System.out.print("Informe a temperatura em graus Fahrenheit: ");
		f = s.nextDouble();
		
		c = (5*(f-32)/9);
		
		System.out.print("Temperatura em graus Celcius: "+ c);
		
		s.close();

	}

}
