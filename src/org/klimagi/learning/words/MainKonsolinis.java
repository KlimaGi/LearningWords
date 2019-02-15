package org.klimagi.learning.words;

import org.klimagi.learning.words.ui.DuomenuIsvedimas;

public class MainKonsolinis extends DuomenuIsvedimas {
	public static void main(String[] args) {

		DuomenuIsvedimas di = new DuomenuIsvedimas() {

			@Override
			public void out(String txt) {
				System.out.println(txt);
			}
		};   //interface'as

		di.isvesti();
	}

	@Override
	public void out(String txt) {
		// TODO Auto-generated method stub

	}
}
