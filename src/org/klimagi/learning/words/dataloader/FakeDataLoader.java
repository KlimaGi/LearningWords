package org.klimagi.learning.words.dataloader;

import java.util.ArrayList;
import java.util.List;

import org.klimagi.learning.words.model.Duo;

public class FakeDataLoader implements DataLoader {

	private List<Duo> duos = new ArrayList<>();

	{
		// duos.add(new ZodziuDuo("en", "lt"));
		duos.add(new Duo("acquire", "isigyti"));
		duos.add(new Duo("ambiguous", "dviprasmiskas"));
		duos.add(new Duo("assert", "tvirtinti"));
		duos.add(new Duo("assumption", "prielaida"));
		duos.add(new Duo("attempt", "bandymas"));
		duos.add(new Duo("attend", "dalyvauti"));
		duos.add(new Duo("alertness", "budrumas"));
		duos.add(new Duo("awareness", "samoningumas"));
		duos.add(new Duo("barely", "vos"));
		duos.add(new Duo("boundary", "riba"));
		duos.add(new Duo("consumption", "vartojimas"));
		duos.add(new Duo("crucial", "lemiamas"));
		duos.add(new Duo("current", "dabartinis"));
		duos.add(new Duo("compatibility", "suderinamumas"));
		duos.add(new Duo("deprecated", "nebenaudojama"));
		duos.add(new Duo("depict", "pavaizduoti"));
		duos.add(new Duo("despite", "nepaisant"));
		duos.add(new Duo("determine", "nustatyti"));
		duos.add(new Duo("deploy", "diegti"));
		duos.add(new Duo("enforcement", "vykdymas"));
		duos.add(new Duo("enhance", "padidinti"));
		duos.add(new Duo("establish", "nustatyti"));
		duos.add(new Duo("encounter", "susidurti"));
		duos.add(new Duo("frequency", "daznis"));
		duos.add(new Duo("guideline", "gaires"));
		duos.add(new Duo("generic", "bendrinis"));
		duos.add(new Duo("heritage", "paveldas"));
		duos.add(new Duo("implement", "igyvendinti"));
		duos.add(new Duo("implication", "reiksmes"));
		duos.add(new Duo("implicitly", "netiesiogiai"));
		duos.add(new Duo("incentive", "paskata"));
		duos.add(new Duo("inherit", "paveldeti"));
		duos.add(new Duo("interaction", "saveika"));
		duos.add(new Duo("measurement", "matavimas"));
		duos.add(new Duo("merely", "tik"));
		duos.add(new Duo("mortgage", "hipoteka"));
		duos.add(new Duo("narrative", "pasakojimas"));
		duos.add(new Duo("native", "gimtoji"));
		duos.add(new Duo("notion", "savoka"));
		duos.add(new Duo("observation", "stebejimas"));
		duos.add(new Duo("occasion", "proga"));
		duos.add(new Duo("penalty", "bauda"));
		duos.add(new Duo("perception", "suvokimas"));
		duos.add(new Duo("predict", "numatyti"));
		duos.add(new Duo("preference", "priemone"));
		duos.add(new Duo("prerequisite", "butina salyga"));
		duos.add(new Duo("plicity", "gausumas"));
		duos.add(new Duo("queue", "eile"));
		duos.add(new Duo("query", "uzklausa"));
		duos.add(new Duo("rapid", "greitas"));
		duos.add(new Duo("reinforce", "sustiprinti"));
		duos.add(new Duo("relevant", "aktualus"));
		duos.add(new Duo("resembles", "primena"));
		duos.add(new Duo("resistance", "atsparumas"));
		duos.add(new Duo("restriction", "apribojimas"));
		duos.add(new Duo("retrieve", "atkurti"));
		duos.add(new Duo("repository", "saugykla"));
		duos.add(new Duo("reveal", "atskleisti"));
		duos.add(new Duo("revenue", "pajamos"));
		duos.add(new Duo("scholar", "mokslininkas"));
		duos.add(new Duo("scope", "taikymo sritis"));
		duos.add(new Duo("severe", "sunkus"));
		duos.add(new Duo("snippet", "fragmentas"));
		duos.add(new Duo("subsequent", "veliau"));
		duos.add(new Duo("sufficiently", "pakankamai"));
		duos.add(new Duo("sustain", "palaikyti"));
		duos.add(new Duo("testify", "liudyti"));
		duos.add(new Duo("tissue", "audinys"));
		duos.add(new Duo("traceability", "atsekamumas"));
		duos.add(new Duo("tribe", "gentis"));
		duos.add(new Duo("undergo", "atlikti"));
		duos.add(new Duo("undergoes", "vyksta"));
		duos.add(new Duo("urge", "noras"));
		duos.add(new Duo("via", "per"));
		duos.add(new Duo("verify", "patikrinti"));
		duos.add(new Duo("welfare", "gerove"));
		duos.add(new Duo("wisdom", "ismintis"));
		duos.add(new Duo("wise", "protingas"));
	}

	@Override
	public List<Duo> loadData() {
		return duos;
	}

}
