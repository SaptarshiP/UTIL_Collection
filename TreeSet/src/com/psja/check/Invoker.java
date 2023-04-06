package com.psja.check;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Set;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Invoker implements Runnable {

	@Override
	public void run() {
		
		NavigableSet<Character> treeSet = new TreeSet<>();
		Set<Character> hashSet = new HashSet<>();
		HashSet<Character> linkedHashSet = new LinkedHashSet<>();
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		for ( Integer i = 0; i<10; i++ ) {
			System.out.println( "Please input the character" );
			try {
				linkedHashSet.add( br.readLine().charAt(0) );
			} catch( IOException exp ) {
				System.out.println( exp.getMessage() );
			} catch( Exception exp ) {
				System.out.println( exp.getMessage() );
			}
		}
		
		hashSet.addAll( linkedHashSet );
		treeSet.addAll( linkedHashSet );
		
		System.out.println( "LINKED HASHST: "+ linkedHashSet );
		System.out.println( "HASHSET: "+ hashSet );
		System.out.println( "TREESET: "+ treeSet );
	}
	
}
