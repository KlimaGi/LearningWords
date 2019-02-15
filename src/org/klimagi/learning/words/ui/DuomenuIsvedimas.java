package org.klimagi.learning.words.ui;

public abstract class DuomenuIsvedimas {

	public void isvesti(String... strings) {

		for (String txt : strings) {
			if (txt != null && !txt.isEmpty()) {
				out(txt);
			}
		}
	}

	public void out(String txt) {

	}


}