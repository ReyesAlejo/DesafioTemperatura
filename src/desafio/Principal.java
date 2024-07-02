package desafio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ConversorTemperatura conversor = new ConversorTemperatura();
		String texto = "Ingrese grados: ";
		DecimalFormat formateador = new DecimalFormat("####.##");
		int opcion = 0;

		System.out.println("\tElija una opción: \n1-Convertir de Celsius aFahrenheit\n2-Fahrenheit  a Celsius");

		try {
			opcion = entrada.nextInt();
		} catch (Exception e) {
			System.err.println("Valor ingresado incorrecto");

		}

		switch (opcion) {
		case 1:
			System.out.println(texto);
			double celsiusGrados = entrada.nextDouble();

			System.out.println(celsiusGrados + "°C" + " equivale a "
					+ formateador.format(conversor.celsiusAFahrenheit(celsiusGrados)) + "°F");
			break;
		case 2:
			System.out.println(texto);
			double fahrenheitGrados = entrada.nextDouble();

			System.out.println(fahrenheitGrados + "°F" + " equivale a "
					+ formateador.format(conversor.fahrenheitACelsius(fahrenheitGrados)) + "°C");
			break;

		default:
			System.err.println("Opción Incorrecta");
			break;
		}

	}
}
