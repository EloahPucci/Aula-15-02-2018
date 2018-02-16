import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Funcionario func1 = new Funcionario();
		func1.nome = "João";
		func1.horasTrabalhadas = 20;
		func1.valorHora = 3.5;
		
		funcionarios.add(func1);
		
		Funcionario func2 = new Funcionario();
		func2.nome = "Mateus";
		func2.horasTrabalhadas = 40;
		func2.valorHora = 5.5;
		
		funcionarios.add(func2);
		
		Funcionario func3 = new Funcionario();
		func3.nome = "Lucas";
		func3.horasTrabalhadas = 40;
		func3.valorHora = 13.5;
		
		funcionarios.add(func3);
		
		for(Funcionario aux: funcionarios) {
			System.out.printf("Salário de %s: R$ %.2f\n", aux.nome, aux.calcularSalario(aux.horasTrabalhadas, aux.valorHora));
		}

	}

}
