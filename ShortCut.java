package com.girija.dto.shortcutsDTO;

import java.util.*;

public class ShortCut {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ctrl+a");
		list.add("ctrl+c");
		list.add("ctrl+v");
		list.add("ctrl+x");
		list.add("ctrl+z");
		list.add("ctrl+shift+f");
		List<String> anotherList = new ArrayList<>();
		anotherList.add("ctrl+o");
		anotherList.add("ctrl+p");
		anotherList.add("ctrl+r");
		anotherList.add("ctrl+s");
		anotherList.add("ctrl+w");
		anotherList.add("ctrl+y");
		anotherList.add("ctrl+n");

		boolean add = anotherList.addAll(list);
		System.out.println("added all:" + add);
		System.out.println("total size after addAll:" + anotherList.size());
		int specific = anotherList.lastIndexOf("ctrl+y");// Returns the index of the last occurrence of the specified
															// element in this list, or -1 if this list does not
															// contain// the element.

		List<String> list2 = list.subList(2, 6);
		System.out.println("it prints index from to:"+list2);

		Object[] objects = list.toArray();
		for (Object obj : objects)
			System.out.println(obj + ",");
		System.out.println("remove perticulr index:"+list.remove(0));
		
		System.out.println("index of ctrl+y :" + specific);
		
		 ListIterator itrf = list.listIterator(3);
		 while(itrf.hasNext())
		      System.out.println(itrf.next());
		 
		boolean contain1 = list.containsAll(anotherList);
		System.out.println("total size after contain all anotherLis &list.size:" + anotherList.size() + " " + "&" + " "
				+ list.size());
		boolean check = anotherList.removeAll(list);
		System.out.println(check);
		System.out.println("total size after remove all anotherLis &list.size:" + anotherList.size() + " " + "&" + " "
				+ list.size());
		boolean contain = list.containsAll(anotherList);
		System.out.println("total size after contain all anotherLis &list.size:" + anotherList.size() + " " + "&" + " "
				+ list.size());
		boolean checking = anotherList.retainAll(list);
		System.out.println("total size after retain all anotherLis &list.size:" + anotherList.size() + " " + "&" + " "
				+ list.size());
		boolean checking1 = list.retainAll(anotherList);
		System.out.println("total size after retain all anotherLis &list.size:" + anotherList.size() + " " + "&" + " "
				+ list.size());

	}

}
