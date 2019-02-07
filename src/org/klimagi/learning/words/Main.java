package org.klimagi.learning.words;

import java.util.List;

import org.klimagi.learning.words.dataloader.DataLoader;
import org.klimagi.learning.words.dataloader.MoreFakeDataLoader;
import org.klimagi.learning.words.model.Duo;
import org.klimagi.learning.words.model.IvedimoResult;
import org.klimagi.learning.words.model.WornLang;
import org.klimagi.learning.words.services.DuoService;

public class Main {

	// RinkinysElle re = new RinkinysElle();
	// re.elle(service.getDuos15());
	public static final void main(String... strings) {

		DataLoader loader = new MoreFakeDataLoader();
		List<Duo> duos = loader.loadData();
		DuoService service = new DuoService(duos);
		FlowControl flContr = new FlowControl(service);

		// service.getDuos15();

		System.out.println(service.getRandomizedDuo().getEn());
		System.out.println();

		String input = "prideti";

		IvedimoResult inputResult = flContr.tikrinkIvedima(input, WornLang.LT);
		if (inputResult.equals(IvedimoResult.NETEISINGAI)) {

			System.out.println("Per daug bandymu, teisingas atsakymas yra :" + input);
		} else if (inputResult.equals(IvedimoResult.TEISINGAI)) {
			System.out.println("Super!");
		} else {
			System.out.println("Bandykite vel");
		}

		service.generuotiRandomDuo();

		System.out.println(service.getRandomizedDuo().getEn());
		System.out.println(flContr.tikrinkIvedima("atimti", WornLang.LT));

	}

}