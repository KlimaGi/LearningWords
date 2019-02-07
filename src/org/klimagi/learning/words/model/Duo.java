package org.klimagi.learning.words.model;

public class Duo { // dvieju atributu klase
	
	private String lt;
	private String en;
	
	// 1* RANDOM zodziu deriniai po 15 arba po 10   +
	// 2* RANDOM en - lt; po to lt - en
	// 3* reikia priskirti en zodzius salia lt
	
	// 4*  tik 15 en zodziu, reikia suvesti lt
	// 4*  tik 15 lt zod, reikia IVESTI en zodzius
	
	
	// ** tikrinti jei teisingai suvesta 2 kartus, tuos zodzius kartoti 20% viso kiekio  
	// **  neteisingai atsakytus zodzius kartoti 80% viso zodziu kiekio
	// **--buble metodas suskirstymui ir rodymui
	//  *** papildomu zodziu ivedimo funkcija
	//
	public Duo(String en, String lt) {  // ar cia eiliskumas svarbu?
		this.lt = lt;
		this.en = en;
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	
	
	
// kaip padaryti atvirkscia varianta
	
	

}
