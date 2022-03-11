package com.collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Group of objects: Collection
		 * Array????
		 * Difference between Array and Collection 
		 * 1. Size of array is fixed, Collections are dynamic /growable
		 * 2. Array can store primitives as well as Objects, Colletions stores only Object
		 * 3. Array contains limited APIs for sorting/searching, Collection is rich API
		 */
		
		//ArrayList extends Object implements List
		// extends Collection
		/*ArrayList al=new ArrayList();
		 * List al=new ArrayList();
		 * Object al=new ArrayList();
		 * Collection al=new ArrayList()
		 * 
		 */
		//array: books
		//list: bookList
		//unordered , unique, sorted
		TreeSet<String> nameSet=new TreeSet<String>();//java.util
		nameSet.add("Sachin");
		nameSet.add("Rakesh");
		nameSet.add("Ajay");
		nameSet.add("Vipin");
		nameSet.add("Sachin");
		
		System.out.println(nameSet);
		
//		for(int i=0;i<nameList.size();i++) {
//			System.out.print(nameList.get(i)+" ");
//		}
//		
//		System.out.println();
//		for(String name:nameList) {
//			System.out.print(name);
//			System.out.print(" " );
//		}
//		
//		System.out.println("  ");
//		Iterator<String> nameIterator=nameList.iterator();
//		while(nameIterator.hasNext()) {
//			System.out.println(nameIterator.next());
//		}
//		//How to convert list to array and array to list
//		String[] names=(String[]) nameList.toArray();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
