
package lista;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o seu nome");
		String nome = s.nextLine();
		System.out.println("Informe sua idade");
		int idade = s.nextInt();
		
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
	}

}
