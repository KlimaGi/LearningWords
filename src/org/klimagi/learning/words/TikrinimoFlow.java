package org.klimagi.learning.words;

import org.klimagi.learning.words.services.DuoService;
import org.klimagi.learning.words.ui.ZodzioIrasymas;

public class TikrinimoFlow {

	public void tikrinimoFlow(DuoService service) {

		FlowControlForOneDuo flContr = new FlowControlForOneDuo(service);

		ZodzioIrasymas dg = new ZodzioIrasymas();

		int size = service.getDuos15().size();
		for (int i = 0; i < size; i++) {

			flContr.reset();
			service.generuotiRandomDuo();
			dg.tikrinamVienaZodi(service.getRandomizedDuo(), flContr);

			// remove from 15's
			service.getDuos15().remove(service.getRandomizedDuo());
		}
	}
}
