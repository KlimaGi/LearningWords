package org.klimagi.learning.words;

import org.klimagi.learning.words.dataloader.FakeDataLoader;
import org.klimagi.learning.words.services.DuoService;

public class Main {

	public static void main(String[] args) {

		DuoService service = new DuoService(new FakeDataLoader().loadData());

		new SekaPratimu(service);

	}
}