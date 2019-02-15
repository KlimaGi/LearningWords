package org.klimagi.learning.words;

import org.klimagi.learning.words.dataloader.FakeDataLoader;
import org.klimagi.learning.words.services.DuoService;
import org.klimagi.learning.words.ui.DuomenuIsvedimas;

public class Main {

	public static void main(String[] args) {

		DuoService service = new DuoService(new FakeDataLoader().loadData());

		new SekaPratimu(service);

	}

	/*
	 * public void dmIsvestiMain() { DuomenuIsvedimas dmiIsvesti = new
	 * DuomenuIsvedimas(); dmiIsvesti.out(); // ? }
	 */

	// DuomenuIsvedimas.out(); //- tinka kai DuomenuIsvedimas yra static

	// new Alpha();Alpha.alpha.DoSomethingAlpha();

	// private DuomenuIsvedimas di = new DuomenuIsvedimas();
	// public void isvedimas() { di.out(); }

	/*
	 * void duomIsvedimas (String txt) { DuomenuIsvedimas dmI = DuomenuIsvedimas();
	 * 
	 * private DuomenuIsvedimas DuomenuIsvedimas() {
	 * 
	 * return null; }
	 */

	// public class Alpha {

	private DuomenuIsvedimas out;

	public Main(DuomenuIsvedimas duomenuIsvedimas) {
		this.dmout = duomenuIsvedimas;
	}

	public void DoSomethingAlpha() {
        this.cbeta.DoSomethingBeta();
    }
}*/

// Alpha cAlpha = new Alpha(new Beta());
}
