package com.TreeSet;

import java.util.Comparator;

public class TestVersityNameCompare implements Comparator<Versity>{
	
	@Override
	public int compare(Versity vr1, Versity vr2) {
		int estdCompare = vr1.getEstd().compareTo(vr2.getEstd());
		int locationCompare = vr1.getLocation().compareTo(vr2.getLocation());
		int nameCompare = vr1.getName().compareTo(vr2.getName());
		int clgCompare = vr1.getCollege().compareTo(vr2.getName());
		int idCompare = vr1.getvId().compareTo(vr2.getvId());
		
		int finalResult = (estdCompare == 0) ? (locationCompare == 0
				? (nameCompare == 0 ? (clgCompare == 0 ? idCompare : nameCompare) : clgCompare) : locationCompare)
				: estdCompare;
		
		return finalResult;
	}



}
