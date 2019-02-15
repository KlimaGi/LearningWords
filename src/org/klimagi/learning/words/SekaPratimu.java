package org.klimagi.learning.words;

import org.klimagi.learning.words.services.DuoService;
import org.klimagi.learning.words.ui.RinkinysElle;

public class SekaPratimu {

	public SekaPratimu(DuoService service) {

		RinkinysElle re = new RinkinysElle();
		re.elle(service.getDuos15());
		
		//TODO 100 tusciu eiluciu

		TikrinimoFlow tf = new TikrinimoFlow();
		tf.tikrinimoFlow(service);
	}

}
