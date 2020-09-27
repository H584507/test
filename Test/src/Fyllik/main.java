package Fyllik;

public class main {

	public static void main(String[] args) {
		g�Hjem(500);
	}

	/**
	 * 
	 * @param skrittDistanse Antall skritt fra fyllikens posisjon til hjemmet sitt = antall skritt fra fyllikens posisjon til puben. 
	 *                       Fylliken st�r midt i mellom puben og hjemmet.
	 */
	public static void g�Hjem(int skrittDistanse) {
		
		// Posisjonen til fylliken bla bla
		int posisjon = skrittDistanse;

		
		while (posisjon > 0 && posisjon < skrittDistanse * 2) {
			if (Math.random() < 0.5) {
				posisjon += 1;
			} else {
				posisjon -= 1;
			}
			System.out.println(posisjon);
		}

		if (posisjon == 0) {
			System.out.println("Fylliken klarte � komme seg hjem. ");
		} else if (posisjon == skrittDistanse * 2) {
			System.out.println("Fylliken endte opp tilbake i puben og kj�pte enda en �l... ");
		}
	}
}
