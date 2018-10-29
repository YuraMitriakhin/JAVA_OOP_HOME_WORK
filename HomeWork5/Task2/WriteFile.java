package Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	private String textOne;
	private String textTwo;
	private File file;

	public WriteFile(String textOne, String textTwo, File file) {
		super();
		this.textOne = textOne;
		this.textTwo = textTwo;
		this.file = file;
		writeFile();
	}

	public WriteFile() {
		super();
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getTextOne() {
		return textOne;
	}

	public void setTextOne(String textOne) {
		this.textOne = textOne;
	}

	public String getTextTwo() {
		return textTwo;
	}

	public void setTextTwo(String textTwo) {
		this.textTwo = textTwo;
	}

	public void writeFile() {
		try (PrintWriter pr = new PrintWriter(file)) {
			pr.print(findWords());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public String findWords() {
		String[] tOne = textOne.split("\\s");
		String[] tTwo = textTwo.split("\\s");
		String words = "";
		for (int i = 0; i < tOne.length; i++) {
			for (int j = 0; j < tTwo.length; j++) {
				if (tOne[i].equals(tTwo[j])) {
					words += tOne[i] + " ";
				}
			}
		}
		return words;
	}

}
