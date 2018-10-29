package Task2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		ReadFile fileOne = new ReadFile(new File("fileOne.txt"));
		ReadFile fileTwo = new ReadFile(new File("fileTwo.txt"));
		WriteFile fileThree = new WriteFile(fileOne.getTextOne(),
				fileTwo.getTextOne(), new File("fileThree.txt"));

	}

}
