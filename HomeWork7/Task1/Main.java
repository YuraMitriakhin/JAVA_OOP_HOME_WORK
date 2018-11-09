package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
        List<Integer> list = inputValue();
        System.out.println(list);
        System.out.println(work(list));
        
	}
	
	public static List<Integer> inputValue(){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++){
			list.add((int)(Math.random()*10));
		}
		return list;
	}
	
	public static List<Integer> work(List<Integer> list){
		list.remove(0);
		list.remove(1);
		list.remove(list.size()-1);
		return list;
	}

}
