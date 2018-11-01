package com.gmail.yuramitryahin;

import java.util.Arrays;

public class BlackList {
	private Object[] bleckList = new Object[10];

	public BlackList() {
		super();
	}

	public BlackList(Object[] bleckList) {
		super();
		this.bleckList = bleckList;
	}

	public Object[] getBleckList() {
		return bleckList;
	}

	public void setBleckList(Object[] bleckList) {
		this.bleckList = bleckList;
	}

	public void pushToBlackList(Object object) {
		for (int i = 0; i < bleckList.length; i++) {
			if (bleckList[i] != null && bleckList[i].equals(object)) {
				System.out.println("This object is already in the black list!");
				break;
			}
			if (bleckList[i] == null) {
				bleckList[i] = object;
				break;
			}
			if (i == bleckList.length) {
				System.out.println("Eror, black list overflow!");
			}

		}
	}

	public void deleteFromBlackList(Object object) {
		for (int i = 0; i < bleckList.length; i++) {
			if (bleckList[i] != null && bleckList[i].equals(object)) {
				bleckList[i] = null;
				break;
			}
			if (i == bleckList.length) {
				System.out.println("Eror, no such object is blacklisted!");
			}

		}
	}

	public boolean checkObject(Object object) {
		for (int i = 0; i < bleckList.length; i++) {
			if (bleckList[i] != null && bleckList[i].equals(object)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bleckList);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlackList other = (BlackList) obj;
		if (!Arrays.equals(bleckList, other.bleckList))
			return false;
		return true;
	}

}
