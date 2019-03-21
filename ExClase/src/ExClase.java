import java.util.Scanner;

public class ExClase {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		double kilos;
		System.out.println("Cuantos kilos ha comprado");
		kilos = lector.nextDouble();
		if (kilos > 0 && kilos < 2) {
			System.out.println("Descuento del 0%");
		}
		else if (kilos>2.01 && kilos<5){
			System.out.println("Descuento del 10%");
		}
		else if (kilos>5.01 && kilos <10) {
			System.out.println("Descuento del 15%");
		}
		else if (kilos>10.01) {
			System.out.println("Descuento del 20%");
		}
		else {
			System.out.println("Valor no valido");
		}
		lector.close();
	}
}
