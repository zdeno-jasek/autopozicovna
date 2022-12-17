package sk.skolenie.autopozicovna.application;

import sk.skolenie.autopozicovna.domain.Autopozicovna;
import sk.skolenie.autopozicovna.domain.AutopozicovnaFactory;

/**
 * Hlavnú funkčnosť systému - požičanie a vrátenie vozidiel.
 * V package-i "sk.skolenie.autopozicovna.application"
 * bude jediná trieda - a to táto (Main).
 * Všetky ostatné triedy budú v package-i "sk.skolenie.autopozicovna.domain".
 */
public class Main {

	/**
	 * Metóda naplní autopožičovňu údajmi (pozri AutopozicovnaFactory)
	 * a potom vykoná tieto pôžičky:
	 * 1. Ján Dlhý si požičia vozidlo Škoda Octavia
	 * 2. Alžbeta Krátka si požičia tiež Škodu Octavia
	 * 3. Zuzana Veľká si požičia Volvo V60
	 * 4. Alžbeta Krátka vráti požičané vozidlo 
	 */
	public static void main(String[] args) {
		Autopozicovna autopozicovna = AutopozicovnaFactory.create();
		
		System.out.println( autopozicovna );
		
		// TODO Implementovať body 1-4
		
	}
}
