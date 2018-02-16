
	public class Paciente {
		String nome;
		double peso;
		double altura;
		
		public double calcularIMC(double peso, double altura) {
			return Math.pow(altura, 2) / peso;
		}
	
	}
