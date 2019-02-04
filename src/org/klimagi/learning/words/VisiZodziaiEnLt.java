package org.klimagi.learning.words;
import java.util.ArrayList;
import java.util.List;

public class VisiZodziaiEnLt { 
	public static final void main(String...strings) {
		
		// tipas/ importuojam lista
		List<ZodziuDuo> duos = new ArrayList<>();

//		duos.add(new ZodziuDuo("en", "lt"));
		duos.add(new ZodziuDuo("acquire", "isigyti"));
		duos.add(new ZodziuDuo("ambiguous", "dviprasmiskas"));
		duos.add(new ZodziuDuo("assert", "tvirtinti"));
		duos.add(new ZodziuDuo("assumption", "prielaida"));
		duos.add(new ZodziuDuo("attempt", "bandymas"));
		duos.add(new ZodziuDuo("attend", "dalyvauti"));
		duos.add(new ZodziuDuo("alertness", "budrumas"));
		duos.add(new ZodziuDuo("awareness", "samoningumas"));
		duos.add(new ZodziuDuo("barely", "vos"));
		duos.add(new ZodziuDuo("boundary", "riba"));
		duos.add(new ZodziuDuo("consumption", "vartojimas"));
		duos.add(new ZodziuDuo("crucial", "lemiamas"));
		duos.add(new ZodziuDuo("compatibility", "suderinamumas"));
		duos.add(new ZodziuDuo("deprecated", "nebenaudojama"));
		duos.add(new ZodziuDuo("depict", "pavaizduoti"));
		duos.add(new ZodziuDuo("despite", "nepaisant"));
		duos.add(new ZodziuDuo("determine", "nustatyti"));
		duos.add(new ZodziuDuo("deploy", "diegti"));
		duos.add(new ZodziuDuo("enforcement", "vykdymas"));
		duos.add(new ZodziuDuo("enhance", "padidinti"));
		duos.add(new ZodziuDuo("establish", "nustatyti"));
		duos.add(new ZodziuDuo("frequency", "daznis"));
		duos.add(new ZodziuDuo("guideline", "gaires"));
		duos.add(new ZodziuDuo("generic", "bendrinis"));
		duos.add(new ZodziuDuo("heritage", "paveldas"));
		duos.add(new ZodziuDuo("implement", "igyvendinti"));
		duos.add(new ZodziuDuo("implication", "reiksmes"));
		duos.add(new ZodziuDuo("implicitly", "netiesiogiai"));
		duos.add(new ZodziuDuo("incentive", "paskata"));
		duos.add(new ZodziuDuo("inherit", "paveldeti"));
		duos.add(new ZodziuDuo("interaction", "saveika"));
		duos.add(new ZodziuDuo("measurement", "matavimas"));
		duos.add(new ZodziuDuo("merely", "tik"));
		duos.add(new ZodziuDuo("mortgage", "hipoteka"));
		duos.add(new ZodziuDuo("narrative", "pasakojimas"));
		duos.add(new ZodziuDuo("native", "gimtoji"));
		duos.add(new ZodziuDuo("notion", "savoka"));
		duos.add(new ZodziuDuo("observation", "stebejimas"));
		duos.add(new ZodziuDuo("occasion", "proga"));
		duos.add(new ZodziuDuo("penalty", "bauda"));
		duos.add(new ZodziuDuo("perception", "suvokimas"));
		duos.add(new ZodziuDuo("predict", "numatyti"));
		duos.add(new ZodziuDuo("preference", "priemone"));
		duos.add(new ZodziuDuo("plicity", "gausumas"));
		duos.add(new ZodziuDuo("queue", "eile"));
		duos.add(new ZodziuDuo("query", "uzklausa"));
		duos.add(new ZodziuDuo("rapid", "greitas"));
		duos.add(new ZodziuDuo("reinforce", "sustiprinti"));
		duos.add(new ZodziuDuo("relevant", "aktualus"));
		duos.add(new ZodziuDuo("resembles", "primena"));
		duos.add(new ZodziuDuo("resistance", "atsparumas"));
		duos.add(new ZodziuDuo("restriction", "apribojimas"));
		duos.add(new ZodziuDuo("repository", "saugykla"));
		duos.add(new ZodziuDuo("reveal", "atskleisti"));
		duos.add(new ZodziuDuo("revenue", "pajamos"));
		duos.add(new ZodziuDuo("scholar", "mokslininkas"));
		duos.add(new ZodziuDuo("scope", "taikymo sritis"));
		duos.add(new ZodziuDuo("severe", "sunkus"));
		duos.add(new ZodziuDuo("snippet", "fragmentas"));
		duos.add(new ZodziuDuo("subsequent", "veliau"));
		duos.add(new ZodziuDuo("sufficiently", "pakankamai"));
		duos.add(new ZodziuDuo("sustain", "palaikyti"));
		duos.add(new ZodziuDuo("testify", "liudyti"));
		duos.add(new ZodziuDuo("tissue", "audinys"));
		duos.add(new ZodziuDuo("traceability", "atsekamumas"));
		duos.add(new ZodziuDuo("tribe", "gentis"));
		duos.add(new ZodziuDuo("undergo", "atlikti"));
		duos.add(new ZodziuDuo("undergoes", "vyksta"));
		duos.add(new ZodziuDuo("urge", "noras"));
		duos.add(new ZodziuDuo("via", "per"));
		duos.add(new ZodziuDuo("verify", "patikrinti"));
		duos.add(new ZodziuDuo("welfare", "gerove"));
		duos.add(new ZodziuDuo("wisdom", "ismintis"));
		duos.add(new ZodziuDuo("wise", "protingas"));
		
		RinkinysElle re = new RinkinysElle();
		
		ZodziuRinkinys zr = new ZodziuRinkinys();
		
		List<ZodziuDuo> atrinkti15 = zr.zodziuSarasas(15, duos);
		re.elle(atrinkti15);
	}
	

	 

}