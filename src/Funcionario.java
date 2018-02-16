
	public class Funcionario {
		String nome;
		int horasTrabalhadas;
		double valorHora;
		
		public double calcularSalario(int horasTrabalhadas, double valorHora) {
			return horasTrabalhadas * valorHora;
		}
	}
