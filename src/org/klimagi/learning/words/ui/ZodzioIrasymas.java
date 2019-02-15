package org.klimagi.learning.words.ui;

import java.util.Scanner;

import org.klimagi.learning.words.FlowControlForOneDuo;
import org.klimagi.learning.words.model.Duo;
import org.klimagi.learning.words.model.IvedimoResult;
import org.klimagi.learning.words.model.WordLang;

public class ZodzioIrasymas extends DuomenuIsvedimas {

	public void tikrinamVienaZodi(Duo duo, FlowControlForOneDuo flContr) {

		out (duo.getEn());
		//System.out.println(duo.getEn());

		Klaviatura idedam = new Klaviatura;
		idedam.klaviaturaIn(keyboardInput);
		
		//Scanner keyboardInput = new Scanner(System.in);

		IvedimoResult inputResult = null;
		do {
			String input = keyboardInput.nextLine();
			inputResult = flContr.tikrinkIvedima(input, WordLang.LT);

			switch (inputResult) {

			case NETEISINGAI_BANDYKITE_VEL:
				out("Bandykite vel");
				// System.out.println("Bandykite vel");
				break;

			case TEISINGAI:
				out("Super!");
				// System.out.println("Super!");
				break;

			case VIS_DAR_NETEISINGAI:
				out("Vis dar neteisingai, teisingas atsakymas yra : " + duo.getLt());
				// System.out.println("Vis dar neteisingai, teisingas atsakymas yra : " +
				// duo.getLt());
				break;

			default:
				out("Tesiam");
				// System.out.println("Tesiam");
			}

		} while (inputResult.equals(IvedimoResult.NETEISINGAI_BANDYKITE_VEL));
		out("done");
		// System.out.println("done");
		out(" ");
		// System.out.println();
		keyboardInput.close();
	}

	@Override
	public void out(String txt) {
		// TODO Auto-generated method stub

	}
}
