package com.psja;

import static java.lang.System.out;
import java.lang.Thread;

public class ObjectSerializationCheck {

	public static void main( String args[] ) {
		out.println( "The serialization check" );
		
		MyThread myThread = new MyThread();
		Thread th1 = new Thread( myThread );
		th1.start();
	}
	
}
