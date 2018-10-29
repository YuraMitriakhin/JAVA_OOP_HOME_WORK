package Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	private String textOne;
	private File file;

	public ReadFile(File file) {
		super();
		this.file = file;
		readText();
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ReadFile() {
		super();
	}

	public String getTextOne() {
		return textOne;
	}

	public void setTextOne(String textOne) {
		this.textOne = textOne;
	}

	public String readText() {
		try (BufferedReader read = new BufferedReader(new FileReader(file))) {
			String text = "";
			int i = 0;
			for (; (text = read.readLine()) != null;) {
				textOne = text;
				i++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return textOne;
	}

}
