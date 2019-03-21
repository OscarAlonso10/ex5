import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		double euros,dolars,yens,total;
		int opcion;
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println(" 1.- Euros a Dolars\n 2.- Euros a Yens\n 3.- Dolars a Euros\n 4.- Dolars a Yens\n 5.- Yens a Euros\n 6.- Yens a Dolars");
			System.out.println();
			System.out.println("Tria una opcio de conversio");
			opcion = lector.nextInt();
		}while(opcion<1 || opcion>6);
		
		switch(opcion) {
		case 1:
			System.out.println("Introdueix quants Euros vols convertir en Dolars");
			euros = lector.nextDouble();
			total = euros*1.11894;
			System.out.println("La conversion de "+euros+" euros son "+total+" dolars");
			break;
		case 2:
			System.out.println("Introdueix quants Euros vols convertir en Yens");
			euros = lector.nextDouble();
			total = euros*115.998;
			System.out.println("La conversion de "+euros+" euros son "+total+" yens");
			break;
		case 3:
			System.out.println("Introdueix quants Dolars vols convertir en Euros");
			dolars = lector.nextDouble();
			total = dolars/1.11894;
			System.out.println("La conversion de "+dolars+" dolars son "+total+" euros");
			break;
		case 4:
			System.out.println("Introdueix quants Dolars vols convertir en Yens");
			dolars = lector.nextDouble();
			total = (dolars/1.11894)*115.998;
			System.out.println("La conversion de "+dolars+" dolars son "+total+" yens");
			break;
		case 5:
			System.out.println("Introdueix quants Yens vols convertir en Euros");
			yens = lector.nextDouble();
			total = yens/115.998;
			System.out.println("La conversion de "+yens+" yens son "+total+" euros");
			break;
		case 6:
			System.out.println("Introdueix quants Yens vols convertir en Dolars");
			yens = lector.nextDouble();
			total = (yens/115.998)*1.11894;
			System.out.println("La conversion de "+yens+" yens son "+total+" dolars");
			break;
		}
		lector.close();
	}
}
