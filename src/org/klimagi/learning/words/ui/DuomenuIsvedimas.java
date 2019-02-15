package org.klimagi.learning.words.ui;

public abstract class DuomenuIsvedimas {

	public void isvesti(String... strings) {

		for (String txt : strings) {
			if (txt != null && !txt.isEmpty()) {
				out(txt);
			}
		}
	}

	public abstract void out(String txt);
}

/*public class DuomenuIsvedimas {
    public static DuomenuIsvedimas duomenuIsvedimas;
    public DuomenuIsvedimas(){
            this.duomenuIsvedimas = this;
}
}*/
/*
@Override
public void out(String txt) {
}*/

/*public class Alpha {

    private Beta cbeta;

    public Alpha(Beta beta) {
        this.cbeta = beta;
    }

    public void DoSomethingAlpha() {
        this.cbeta.DoSomethingBeta();
    }
}*/

// Alpha cAlpha = new Alpha(new Beta());   