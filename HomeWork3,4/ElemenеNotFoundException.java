package com.gmail.yuramitryahin;

public class Elemen�NotFoundException extends Exception {
	
	@Override
	public String getMessage(){
    	return "No such student found!";
    }
}
