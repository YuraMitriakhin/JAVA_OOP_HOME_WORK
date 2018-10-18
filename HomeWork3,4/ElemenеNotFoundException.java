package com.gmail.yuramitryahin;

public class ElemenåNotFoundException extends Exception {
	
	@Override
	public String getMessage(){
    	return "No such student found!";
    }
}
