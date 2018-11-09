package Task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ReadFile {
	private Map<Character, Integer> text = new HashMap<>();
	private String alf = "abcdefghijklmnopqrstuvwxyz";

	public ReadFile() {
		super();
	}

	public ReadFile(Map<Character, Integer> text) {
		super();
		this.text = text;
	}

	public Map<Character, Integer> getText() {
		return text;
	}

	public void setText(Map<Character, Integer> text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "ReadFile [text=" + text + "]";
	}

	public Map<Character, Integer> read() {
		filling();
		try (BufferedReader bf = new BufferedReader(new FileReader(new File(
				"text.txt")))) {
			String t = "";
			for (; (t = bf.readLine()) != null;) {
				System.out.println(t);
				check(t);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	public void filling() {
		for (int i = 0; i < alf.length(); i++) {
			text.put(alf.charAt(i), 0);
		}
	}

	public void check(String line) {
		for (int i = 0; i < line.length(); i++) {
			for (int j = 0; j < alf.length(); j++) {
				if (line.charAt(i) == alf.charAt(j)) {
					int k = text.get(alf.charAt(j));
					text.put(alf.charAt(j), k + 1);
				}
			}
		}
	}

	public void sort() {
		for (int j = 0; j < alf.length(); j++) {
			for (int i = j + 1; i < alf.length(); i++) {
				if (text.get(alf.charAt(i))<text.get(alf.charAt(j))) {
					int k = text.get(alf.charAt(j));
					text.put(alf.charAt(j), text.get(alf.charAt(i)));
					text.put(alf.charAt(i), k);
				}
			}
		}
	}


}
