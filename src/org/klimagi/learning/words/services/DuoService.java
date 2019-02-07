package org.klimagi.learning.words.services;

import java.util.List;

import org.klimagi.learning.words.model.Duo;
import org.klimagi.learning.words.model.WornLang;
import org.klimagi.learning.words.utils.ZodziaiUtil;

public class DuoService {

	private static final int DUOS_SIZE_15 = 15;
	private List<Duo> duos15 = null;
	private Duo duo = null;
	
	public DuoService(List<Duo> data) {
		duos15 = ZodziaiUtil.gautiRandomDuos(data, DUOS_SIZE_15);
		generuotiRandomDuo();
	}
	
	public List<Duo> getDuos15() {
		return duos15;
	}
	
	public void generuotiRandomDuo() {
		duo = ZodziaiUtil.gautiRandomDuo(duos15);
	}
	
	@Deprecated
	public void generuotiRandomDuoStatic() {
		duo = duos15.get(0);
	}
	
	public Duo getRandomizedDuo() {
		return duo;
	}

	public boolean klausimasVertimas( String input, WornLang inputLang) { // ka butent naudosiu

		String inputEn;
		String inputLt;

		if (inputLang.equals(WornLang.EN)) {
			inputEn = input;
			inputLt = duo.getLt();
		} else {
			inputEn = duo.getEn();
			inputLt = input;
		}

		return inputLt.equalsIgnoreCase(inputEn);

	
	}
}
