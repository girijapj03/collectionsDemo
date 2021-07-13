package com.girija.dto.difference;

import java.util.*;

public class IterListIterDiffDemo {

	public static void main(String[] args) {
		List<String> starsGroup=new ArrayList<String>();
		starsGroup.add("*********");
		starsGroup.add("********");
		starsGroup.add("*******");
		starsGroup.add("******");
		starsGroup.add("*****");
		starsGroup.add("****");
		starsGroup.add("***");
		starsGroup.add("**");
		starsGroup.add("*");
		
		Iterator itr=starsGroup.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator<String> list=starsGroup.listIterator(8);
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
		
		List<String> myName=new ArrayList<String>();
		myName.add("G");
		myName.add("GI");
		myName.add("GIR");
		myName.add("GIRI");
		myName.add("GIRIJ");
		myName.add("GIRIJA");
		Iterator itr1=myName.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		ListIterator<String> list1=myName.listIterator(5);
		while(list1.hasPrevious()) {
			System.out.println(list1.previous());
		}
		
}

}
