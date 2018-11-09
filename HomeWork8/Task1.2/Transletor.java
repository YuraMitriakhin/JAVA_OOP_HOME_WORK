package Task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Transletor {
	Map<String, String> dictionary = new HashMap<>();

	public Transletor(Map<String, String> dictionary) {
		super();
		this.dictionary = dictionary;
		filling();
	}

	public Transletor() {
		super();
		filling();
	}

	public Map<String, String> getText() {
		return dictionary;
	}

	public void setText(Map<String, String> dictionary) {
		this.dictionary = dictionary;
	}

	public void filling() {
		dictionary.put("teacher", "вчитель");
		dictionary.put("teaches", "вчить");
		dictionary.put("his", "своїх");
		dictionary.put("disciples", "унчнів");
	}

	public String[] readFile() {
		String text = "";
		try (BufferedReader bf = new BufferedReader(new FileReader(new File(
				"EnglishIn.txt")))) {
			String t = "";
			for (; (t = bf.readLine()) != null;) {
				text += t;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text.split(" ");
	}

	public String translate() {
		String[] text = readFile();
		String textOut = "";
		Set<Map.Entry<String, String>> set = dictionary.entrySet();
		for (int i = 0; i < text.length; i++) {
			for (Map.Entry<String, String> s : set) {
				if (text[i].equals(s.getKey())) {
					textOut += s.getValue() + " ";
				}
			}
		}
		return textOut;
	}

	public void writeFile() {
		try (PrintWriter pr = new PrintWriter("UkrainOut.txt")) {
			pr.print(translate());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addDictionary(){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter English word - ");
    	String eng = sc.nextLine();
    	System.out.print("Enter translate - ");
    	String ukr = sc.nextLine();
    	dictionary.put(eng, ukr);
    }

	public void writeDictionary() {
		try (PrintWriter wr = new PrintWriter("Dictionary.txt")) {
			Set<Map.Entry<String, String>> set = dictionary.entrySet();
				for (Map.Entry<String, String> s : set) {
						wr.println(s.getKey() + " - " + s.getValue());
					}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
