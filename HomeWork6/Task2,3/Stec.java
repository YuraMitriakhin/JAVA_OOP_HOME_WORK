package com.gmail.yuramitryahin;

import java.util.Arrays;

public class Stec {
	private Object[] object = new Object[10];
	private BlackList blackList;

	public Stec() {
		super();
	}

	public Stec(BlackList blackList) {
		super();
		this.blackList = blackList;
	}

	public Object[] getObject() {
		return object;
	}

	public void setObject(Object[] object) {
		this.object = object;
	}

	public void push(Object object) {
		for (int i = 0; i < this.object.length; i++) {
			if (blackList.checkObject(this.object[i])) {
				System.out.println("This object is banned");
				break;
			}
			if (this.object[i] == null
					&& !blackList.checkObject(this.object[i])) {
				this.object[i] = object;
				break;
			}
			if (i == this.object.length - 1) {
				System.out.println("Eror, stack overflow!");
			}
		}
	}

	public Object pop() {
		Object object = null;
		for (int i = this.object.length; i <= 0; i--) {
			if (this.object[i] != null) {
				object = this.object[i];
				this.object[i] = null;
			}
		}
		return object;
	}

	public Object top() {
		for (int i = this.object.length; i <= 0; i--) {
			if (this.object[i] != null) {
				return this.object[i];
			}
		}
		return null;
	}

}
