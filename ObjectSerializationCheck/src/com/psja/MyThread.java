package com.psja;

import java.lang.Runnable;

import com.psja.check.SerializationCheck;

public class MyThread implements Runnable {

	private SerializationCheck serializationCheck = new SerializationCheck() ;
	
	@Override
	public void run() {
		serializationCheck.check();
	}
	
}
