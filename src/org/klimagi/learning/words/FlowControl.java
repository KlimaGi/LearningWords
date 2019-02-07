package org.klimagi.learning.words;

import org.klimagi.learning.words.model.IvedimoResult;
import org.klimagi.learning.words.model.WornLang;
import org.klimagi.learning.words.services.DuoService;

public class FlowControl {

	private static final int MAX_TRIES = 5;

	private DuoService service;

	private int ivedimoCount = 0;

	public FlowControl(DuoService service) {
		this.service = service;
		reset();
	}

	public void reset() {
		ivedimoCount = 0;
		service.generuotiRandomDuo();
	}

	public IvedimoResult tikrinkIvedima(String input, WornLang inputLang) {

		ivedimoCount++;

		if (ivedimoCount < MAX_TRIES) {

			if (service.klausimasVertimas(input, inputLang)) {
				return IvedimoResult.TEISINGAI;
			} else {
				return IvedimoResult.NETEISINGAI;
			}
		} else {
			return IvedimoResult.PER_DAUG_BANDYMU;
		}
	}

	// String secretWord = duo.getEn(); // get viena ZodziuDuo derini
	// String ats = duo.getLt(); // reikia irasyti vertima, kuris atitiktu derini
	// int atsSk = 0;
	// int atsLimitas = 5;
	// boolean atsVirsLimito = false;
	//
	// while (!inputlt.equals(inputen) && !atsVirsLimito) { // kai neteisingai
	// suvestas zodis
	// if (atsSk < atsLimitas) {
	// atsSk++;
	// return "Bandykite vel";
	// } else {
	// atsVirsLimito = true;
	// return "Teisingas atsakymas: " + inputlt;
	// }
	// }

}
