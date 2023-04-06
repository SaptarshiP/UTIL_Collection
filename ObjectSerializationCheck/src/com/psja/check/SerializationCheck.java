package com.psja.check;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SerializationCheck {
	
	public void check() {
		
		Employee emp = new Employee( "emp001", "PSJA", "Howrah Shibpur" );
		
		try {
			FileOutputStream fout = new FileOutputStream( "C:/Users/sapprama/Desktop/f.txt" );
			ObjectOutputStream objectOutputStream = new ObjectOutputStream( fout );
			
			objectOutputStream.writeObject( emp );
		} catch( FileNotFoundException exp ) {
			System.out.println( exp.getMessage() );
		} catch( IOException exp ) {
			System.out.println( exp.getMessage() );
		}
	}

}
