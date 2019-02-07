package org.klimagi.learning.words.dataloader;

import java.util.ArrayList;
import java.util.List;

import org.klimagi.learning.words.model.Duo;

public class MoreFakeDataLoader implements DataLoader {

	private List<Duo> duos = new ArrayList<>();

	{
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));
		duos.add(new Duo("add", "prideti"));

	}

	@Override
	public List<Duo> loadData() {
		return duos;
	}

}
