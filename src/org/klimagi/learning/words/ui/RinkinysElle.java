package org.klimagi.learning.words.ui;

import java.util.List;

import org.klimagi.learning.words.model.Duo;

public class RinkinysElle {

	public void elle(List<Duo> sarasas) {

		output(sarasas, false, true);
	}

	public void ltSide(List<Duo> sarasas) {
		output(sarasas, false, true);
	}

	public void enSide(List<Duo> sarasas) {
		output(sarasas, true, false);
	}

	private void output(List<Duo> sarasas, boolean en, boolean lt) {

		for (Duo duo : sarasas) {

			if (en) {

				out(duo.getEn() + " - ");
				// System.out.print(duo.getEn() + " - ");
			}
			if (lt) {

				out(duo.getLt());
				// System.out.print(duo.getLt());
			}
			out("");
			// System.out.println();

			// System.out.println(duo.getEn() + " - " + duo.getLt()); // en - lt kita karta
			// lt - en
		}
	}

	private void out(String txt) {
		
		
	}

}