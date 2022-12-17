package sk.skolenie.autopozicovna.domain;

/**
 * Táto trieda vytvorí autopožičovňu naplnenú týmito dátami:
 * KLIENTI:
 * - Jano Dlhý, Mudroňova 5, 82301 Bratislava, Slovensko
 * - Alžbeta Krátka, Jarabinova 7, 81101 Bratislava, Slovensko
 * - Zuzana Veľká, 1. mája, 94905 Nitra
 * (všetci klienti majú ako dátum prihlásenia použitý dnešný dátum)
 * 
 *  VOZIDLÁ:
 *  - Škoda Octavia, výrobca: Škoda, počet: 7
 *  - Volvo V60, výrobca: Volvo, počet: 1
 *  - Hyundia Ioniq, výrobca: Hyunida, počet: 4
 *
 */
public class AutopozicovnaFactory {

	public static Autopozicovna create() {
		Autopozicovna autopozicovna = new Autopozicovna();
		
		// TODO implementovať kód podľa zadania
		
		return autopozicovna;
	}
}
