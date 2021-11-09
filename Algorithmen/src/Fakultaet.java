import java.time.Duration;
import java.time.Instant;

public class Fakultaet {


	private static Instant start; 
	private static Instant end; 
	private static Duration duration; 
	
	public static void main(String[] args) {
		System.out.print("Summe rekursiv: ");
		start = Instant.now(); 
		long summeRekursiv = sum(12000);
		end = Instant.now(); 
		duration = Duration.between(start, end); 
		System.out.println(summeRekursiv + ", berechnet in " + duration.toMillis() + " Millisekunden");

		System.out.print("Summe endrekursiv: ");
		start = Instant.now(); 
		long summeEndrekursiv = endSum(0, 12000);
		end = Instant.now(); 
		duration = Duration.between(start, end); 
		System.out.println(summeEndrekursiv + ", berechnet in " + duration.toMillis() + " Millisekunden");

		System.out.print("Fakult�t rekursiv: ");
		start = Instant.now(); 
		long fakRekursiv = faku(35);
		end = Instant.now(); 
		duration = Duration.between(start, end); 
		System.out.println(fakRekursiv + ", berechnet in " + duration.toMillis() + " Millisekunden");

		System.out.print("Fakult�t endrekursiv: ");
		start = Instant.now(); 
		long fakEndRekursiv = endFaku(1, 35);
		end = Instant.now(); 
		duration = Duration.between(start, end); 
		System.out.println(fakEndRekursiv + ", berechnet in " + duration.toMillis() + " Millisekunden");

		System.out.print("Hochfunktion rekursiv: ");
		start = Instant.now(); 
		long powfakRekursiv = powfak(2, 50);
		end = Instant.now(); 
		duration = Duration.between(start, end); 
		System.out.println(powfakRekursiv + ", berechnet in " + duration.toMillis() + " Millisekunden");

		System.out.print("Hochfunktion endrekursiv: ");
		start = Instant.now(); 
		long powfakEndrekursiv = endPowfak(1, 2, 50);
		end = Instant.now(); 
		duration = Duration.between(start, end); 
		System.out.println(powfakEndrekursiv + ", berechnet in " + duration.toMillis() + " Millisekunden");

	}

	public static long sum(int zahl) {
		if (zahl >= 1) {
			return zahl + sum(zahl - 1);
		}

		return 0;
	}

	public static long endSum(long sum, int zahl) {
		if (zahl == 0) {
			return sum;
		}
		return endSum(sum + zahl, zahl - 1);
	}

	public static long faku(int zahl) {
		if (zahl >= 1) {
			return zahl * faku(zahl - 1);
		}
		return 1;

	}

	public static long endFaku(long prod, int zahl) {
		if (zahl == 0) {
			return prod;
		}
		return endFaku(prod * zahl, zahl - 1);
	}

	public static long powfak(int basis, int exponent) {
		if (exponent >= 1) {
			return basis * powfak(basis, exponent - 1);
		}
		return 1;
	}

	public static long endPowfak(long prod, int basis, int exponent) {
		if (exponent == 0) {
			return prod;
		}
		return endPowfak(prod * basis, basis, exponent - 1);
	}
}
