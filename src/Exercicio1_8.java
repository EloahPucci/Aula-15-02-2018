import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Digite o raio do primeiro c�rculo:");
		
		Circulo circulo1 = new Circulo();
		circulo1.raio = sc.nextInt();
		double area1 = circulo1.calcularArea(circulo1.raio);
		double perimetro1 = circulo1.calculaPerimetro(circulo1.raio);
		
		System.out.println("Digite o raio do segundo c�rculo:");
		
		Circulo circulo2 = new Circulo();
		circulo2.raio = sc.nextInt();
		double area2 = circulo2.calcularArea(circulo2.raio);
		double perimetro2 = circulo2.calculaPerimetro(circulo2.raio);
		
		System.out.println("Digite o raio do terceiro c�rculo:");
		
		Circulo circulo3 = new Circulo();
		circulo3.raio = sc.nextInt();
		double area3 = circulo3.calcularArea(circulo3.raio);
		double perimetro3 = circulo3.calculaPerimetro(circulo3.raio);
		
		
		System.out.printf("C�rculo de raio %d metros=> �rea: %.2fm� Per�metro: %.2fm�\nC�rculo de raio %d metros=> �rea: %.2fm� Per�metro: %.2fm�\nC�rculo de raio %d metros=> �rea: %.2fm� Per�metro: %.2fm�", circulo1.raio, area1, perimetro1, circulo2.raio, area2, perimetro2, circulo3.raio, area3, perimetro3);

	}

}