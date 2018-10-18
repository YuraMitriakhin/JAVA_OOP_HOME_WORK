package com.gmail.yuramitryahin;

public class ArrayOverrunException extends Exception {
	
	@Override
	public String getMessage() {
		return "Group is full!";
	}

}
