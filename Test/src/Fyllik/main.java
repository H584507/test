package Fyllik;

public class main {

	public static void main(String[] args) {
		gåHjem(500);
	}

	/**
	 * 
	 * @param skrittDistanse Antall skritt fra fyllikens posisjon til hjemmet sitt = antall skritt fra fyllikens posisjon til puben. 
	 *                       Fylliken står midt i mellom puben og hjemmet.
	 */
	public static void gåHjem(int skrittDistanse) {
		
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
			System.out.println("Fylliken klarte å komme seg hjem. ");
		} else if (posisjon == skrittDistanse * 2) {
			System.out.println("Fylliken endte opp tilbake i puben og kjøpte enda en øl... ");
		}
	}
}
