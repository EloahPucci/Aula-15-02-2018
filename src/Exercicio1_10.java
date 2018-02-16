import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {			
			
			Funcionario func = new Funcionario();
			
			System.out.printf("Digite o nome do funcionário %d:\n", i+1);
			func.nome = sc.next();
			System.out.printf("Quantas horas %s trabalhou?\n", func.nome);
			func.horasTrabalhadas = sc.nextInt();
			System.out.printf("E qual é o valor da hora trabalhada de %s?\n", func.nome);
			func.valorHora = sc.nextDouble();
			
			funcionarios.add(func);			
		}
		
		System.out.println();
		
		for(Funcionario aux: funcionarios) {
			System.out.printf("Salário de %s: R$ %.2f\n", aux.nome, aux.calcularSalario(aux.horasTrabalhadas, aux.valorHora));
		}
	}
}