package org.klimagi.learning.words;
import java.util.List;

public class RinkinysElle {

	// gauti sarasa su pirmiau en - lt
	// 2* gauti ta pati sarasa lt - en

	// random sarasa tik en ----- suvedimui lt  Is TESTO dalies
	// random sarasa tik lt ----- suvedimui en

	public void elle(List<ZodziuDuo> z) {
		
		output(z , true, true);
		output(z , false, true);
	}
	
	private void output(List<ZodziuDuo> sarasas , boolean en, boolean lt) {
		
		for (ZodziuDuo duo : sarasas) {
			
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
