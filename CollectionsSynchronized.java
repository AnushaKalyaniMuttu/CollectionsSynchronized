package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsSynchronized {
	/*
	 *Collections.synchronizedlist
	 *returns a synchronised list which allows multiple thread to access
	 *the list safely
	 */

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.synchronizedCollection(list);
		Collections.synchronizedList(list);
		NavigableMap<Integer,Integer> map=new TreeMap<>();
		Collections.synchronizedMap(map);
		Collections.synchronizedNavigableMap(map);
		NavigableSet<Integer> navigableSet=new TreeSet<>();
		Collections.synchronizedNavigableSet(navigableSet);
		Collections.synchronizedSet(navigableSet);
		Collections.synchronizedSortedMap(map);
		Collections.synchronizedSortedSet(navigableSet);
}
		
	}
