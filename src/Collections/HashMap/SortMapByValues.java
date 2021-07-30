package Collections.HashMap;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortMapByValues {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(2, null);

		map.put(78, "cars");
		map.put(31, "bikes");
		map.put(89, "Bus");

		map.put(3, "horses");
		map.put(12, "plane");
		List<String> ke = new ArrayList<>();
		ke.add("4a-3");
		ke.add("3a5");
		ke.add("1a12");
		ke.add("5a2");
		int x = 1000000000000000000;
		String [] temp = ke.get(2).split("a");

		System.out.println("Keys before- "+"\n"+ke);
		Collections.sort(ke);
		System.out.println("Keys after- "+"\n"+ke);
		System.out.println("res- "+"\n"+temp[1]);
		
		 int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 10;
		    Random random = new Random();
		    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    String generatedString = buffer.toString();

		    System.out.println(generatedString);
		
		//System.out.println("Before anything- "+"\n"+map);
		
		
//		Map<Integer,String> result = new LinkedHashMap<>();
//        map.entrySet().stream()
//                .sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
//                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
		
		//System.out.println("After -"+"\n"+result);
		
	}
}
	
