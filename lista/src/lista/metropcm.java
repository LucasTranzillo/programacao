package lista;
import java.util.Scanner;

public class metropcm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double m, cm;
		System.out.print("Informe o valor em METROS:");
		m = s.nextDouble();
		
		cm = m * 100;
		
		System.out.print("Valor em centimetros: "+ cm);
		
		s.close();
		
		
		

	}

}
