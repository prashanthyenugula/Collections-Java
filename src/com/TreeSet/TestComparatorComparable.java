package com.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.pojo.RedBusPojo;

public class TestComparatorComparable {
	
	public static void main(String[] args) {
		
		RedBusPojo rb1 = new RedBusPojo(222, "Orange", 1500, "19:30", "4:45");
		RedBusPojo rb2 = new RedBusPojo(333, "Veerabhadra", 1000, "21:30", "5:00");
		RedBusPojo rb3 = new RedBusPojo(444, "Kesineni", 1200, "20:30", "5:45");
		RedBusPojo rb4 = new RedBusPojo(555, "Zabbar", 2000, "22:30", "6:45");
		RedBusPojo rb5 = new RedBusPojo(222, "Orange", 1500, "22:00", "6:30");
		
		Set<RedBusPojo> set = new TreeSet<>(/*new RedBusFareSort()*/);
		set.add(rb1);
		set.add(rb2);
		set.add(rb3);
		set.add(rb4);
		set.add(rb5);
		
		System.out.println(set);
				
	}

}


/*
class RedBusFareSort implements Comparator<RedBusPojo> {

	@Override
	public int compare(RedBusPojo b1, RedBusPojo b2) {
		int faresort = b1.getFare().compareTo(b2.getFare());
		int serviceNoSort = b1.getServiceNo().compareTo(b2.getServiceNo());
		return (faresort == 0) ? serviceNoSort :faresort;
	}
	
}*/
