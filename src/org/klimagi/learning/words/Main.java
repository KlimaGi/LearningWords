package org.klimagi.learning.words;

import org.klimagi.learning.words.dataloader.FakeDataLoader;
import org.klimagi.learning.words.services.DuoService;
import org.klimagi.learning.words.ui.DuomenuIsvedimas;

public class Main {

	public static void main(String[] args) {

		DuoService service = new DuoService(new FakeDataLoader().loadData());

		new SekaPratimu(service);

		
	//	DuomenuIsvedimas isvedimas = new DuomenuIsvedimas(new out());
		
	}
	
}
