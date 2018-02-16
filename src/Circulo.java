	
	public class Circulo{
		int raio;
		
		public double calcularArea(int raio) {
			return Math.pow(raio, 2) * 3.1416;
		}
		
		public double calculaPerimetro(int raio) {
			return 2 * 3.1416 * raio;
		}
	}
