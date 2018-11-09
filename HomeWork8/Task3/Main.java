package Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int[] arr = filling();

		Map<Integer, Integer> map = counter (arr);
		System.out.println(map);
	}
	
	public static int[] filling(){
		int[]mass = new int[20];
		for (int i = 0; i < mass.length; i++) {
			mass[i]=(int)(Math.random()*10);
		}
		return mass;
	}

	public static Map<Integer, Integer> counter (int[]arr){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		return map;
	}
}
