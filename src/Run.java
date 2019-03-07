import java.util.Scanner;

public class Run {

	
		public static void main(String[] args) {
			System.out.println("Introduce la cadena de numeros");
			Scanner teclado = new Scanner (System.in);
			String entrada = teclado.nextLine();
			
			if (entrada.contains("+")) {
				Union union = new Union	(entrada);
				System.out.println(union);

		}
			if (entrada.contains("*")) {
				Interseccion inter = new Interseccion(entrada);
				System.out.println(inter);
				 
			}
			
			if (entrada.contains("-")) {
				Resta resta = new Resta(entrada);
				System.out.println(resta);
			}
			
			teclado.close();
		}
	


	}

	
