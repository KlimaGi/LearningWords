package org.klimagi.learning.words;

import org.klimagi.learning.words.model.IvedimoResult;
import org.klimagi.learning.words.model.WordLang;
import org.klimagi.learning.words.services.DuoService;

public class FlowControlForOneDuo {

	private static final int MAX_TRIES = 1;

	private DuoService service;

	private int ivedimoCount = 0;

	public FlowControlForOneDuo(DuoService service) {
		this.service = service;
		reset();
	}

	public void reset() {
		ivedimoCount = 0;
		service.generuotiRandomDuo();
	}

	public IvedimoResult tikrinkIvedima(String input, WordLang inputLang) {

		ivedimoCount++;

		if (ivedimoCount <= MAX_TRIES) {

			if (service.klausimasVertimas(input, inputLang)) {
				return IvedimoResult.TEISINGAI;

			} else {
				return IvedimoResult.NETEISINGAI_BANDYKITE_VEL;
			}
		} else {
			return IvedimoResult.VIS_DAR_NETEISINGAI;
		}
	}
}
