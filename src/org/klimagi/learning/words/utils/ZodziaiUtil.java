package org.klimagi.learning.words.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.klimagi.learning.words.model.Duo;

public class ZodziaiUtil {

	// diraba tik su random gautu zodziu sarasu is didziojo ListoDuo ir istraukia
	// random zodziu derini
	public static Duo gautiRandomDuo(List<Duo> list) {
		Random rnd = new Random();
		return list.get(rnd.nextInt(list.size()));
	}

	public static List<Duo> gautiRandomDuos(List<Duo> list, int kiekisZ) {

		List<Duo> result = new ArrayList<>();
		for (int i = 0; i < kiekisZ; i++) {
			result.add(gautiRandomDuo(list));
		}

		return result;
	}
}
