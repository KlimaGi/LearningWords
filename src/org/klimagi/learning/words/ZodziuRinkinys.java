package org.klimagi.learning.words;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZodziuRinkinys {

	private int kiekisZ = 15; 
	
	public List<ZodziuDuo> zodziuSarasas(int kiekisZ, List<ZodziuDuo> data) {
		// is data vis duomenu ims KIEKI int 15 ir grazins i List<ZodziuDuo>, taip sis
		// (List<ZodziuDuo>) metodas vadinamas

		Random rnd = new Random();

		int randomIndex = 0;

		List<ZodziuDuo> result = new ArrayList<>();

		for (int i = 0; i < kiekisZ; i++) {
			randomIndex = rnd.nextInt(data.size());
			result.add(data.get(randomIndex));
		}

		return result;
	}

	// zodziu rinkinys nurodant kas pirmiau bus rodoma ar EN - LT; ar LT - EN

}
