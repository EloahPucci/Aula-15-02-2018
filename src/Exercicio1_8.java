import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Digite o raio do primeiro círculo:");
		
		Circulo circulo1 = new Circulo();
		circulo1.raio = sc.nextInt();
		double area1 = circulo1.calcularArea(circulo1.raio);
		double perimetro1 = circulo1.calculaPerimetro(circulo1.raio);
		
		System.out.println("Digite o raio do segundo círculo:");
		
		Circulo circulo2 = new Circulo();
		circulo2.raio = sc.nextInt();
		double area2 = circulo2.calcularArea(circulo2.raio);
		double perimetro2 = circulo2.calculaPerimetro(circulo2.raio);
		
		System.out.println("Digite o raio do terceiro círculo:");
		
		Circulo circulo3 = new Circulo();
		circulo3.raio = sc.nextInt();
		double area3 = circulo3.calcularArea(circulo3.raio);
		double perimetro3 = circulo3.calculaPerimetro(circulo3.raio);
		
		
		System.out.printf("Círculo de raio %d metros=> Área: %.2fm² Perímetro: %.2fm²\nCírculo de raio %d metros=> Área: %.2fm² Perímetro: %.2fm²\nCírculo de raio %d metros=> Área: %.2fm² Perímetro: %.2fm²", circulo1.raio, area1, perimetro1, circulo2.raio, area2, perimetro2, circulo3.raio, area3, perimetro3);

	}

}