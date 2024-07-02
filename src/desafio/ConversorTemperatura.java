package desafio;

public class ConversorTemperatura implements IOperacionesConversion {

	@Override
	public double celsiusAFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	@Override
	public double fahrenheitACelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

}
