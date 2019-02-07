package org.klimagi.learning.words;
import java.util.List;

import org.klimagi.learning.words.model.Duo;

public class RinkinysElle {

	// gauti sarasa su pirmiau en - lt   +
	// 2* gauti ta pati sarasa lt - en

	// random sarasa tik en ----- suvedimui lt  Is TESTO dalies
	// random sarasa tik lt ----- suvedimui en

	public void elle(List<Duo> sarasas) {
		
		output(sarasas , true, true);
		output(sarasas , false, true);
	}
	
	private void output(List<Duo> sarasas , boolean en, boolean lt) {
		
		for (Duo duo : sarasas) {
			
			if (en) {
				System.out.print(duo.getEn() + " - ");
			}
			if (lt) {
				System.out.print(duo.getLt());
			}
			
			System.out.println();
			
			
			// System.out.println(duo.getEn() + " - " + duo.getLt());  //  en - lt     kita karta     lt - en
		}
		
	}

}
