package com.psja;

import static java.lang.System.out;

import com.psja.check.CheckDesirializationCheck;

public class ObjectDeSerializationCheck {

	public static void main( String args[] ) {
		
		out.println( "In Deseralization Check" );
		CheckDesirializationCheck checkDeserializationCheck = new CheckDesirializationCheck();
		checkDeserializationCheck.check();
	}
	
}
