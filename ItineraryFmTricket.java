package geeksforgeek;

import java.util.HashMap;

import java.util.Map;

public class ItineraryFmTricket {
public static void printDestination(HashMap<String,String> map) {
	HashMap<String,String> reverseData = new HashMap<>();
	String start=null;
	for(Map.Entry<String, String> entrySet : map.entrySet()) {
		reverseData.put(entrySet.getValue(), entrySet.getKey());
	}
	
	for(Map.Entry<String, String> entrySet : map.entrySet()) {
		if(!reverseData.containsKey(entrySet.getKey())) {
			 start = entrySet.getKey();
			 System.out.println("start" + start);
			break;
		}
		
	}
	
	if(start == null) {
		System.out.print("invalid input");
		}
	
	String to =map.get(start);
	System.out.println("start" + to);
	while(to!= null) {
		System.out.println(start +" => "+ to);
		start =to;
		to = map.get(to);
	}
}
	public static void main(String[] args) {
		System.out.println("start");
		
		HashMap<String,String> dataSet = new HashMap<>();
		
        dataSet.put("Chennai", "Banglore"); 
        dataSet.put("Bombay", "Delhi"); 
        dataSet.put("Goa", "Chennai"); 
        dataSet.put("Delhi", "Goa"); 
        printDestination(dataSet);
  
		
	}

}
