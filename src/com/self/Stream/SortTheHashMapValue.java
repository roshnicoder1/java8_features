package com.self.Stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Using stream() API sort the below list in revrse order
[("a",3),("b",4),("c",76),("d",43)]
 */
public class SortTheHashMapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("a", 3);
		map.put("b", 4);
		map.put("c", 76);
		map.put("d", 43);
		map.forEach((k,v)->System.out.println(k+":"+v));
		HashMap<String,Integer> sortedMap=sortHashMapByValue(map);
		System.out.println("After Sorting");
		 // print the sorted hashmap
//		sortedMap.forEach((k,v)->System.out.println(k+":"+v));
		for(Map.Entry<String, Integer> hm:sortedMap.entrySet()) {
			 System.out.println("Key = " + hm.getKey() +
                     ", Value = " + hm.getValue());
		}

	}

	private static HashMap<String, Integer> sortHashMapByValue(HashMap<String, Integer> map) {
//		Set<Entry<String, Integer>> set=map.entrySet();
//		System.out.println("The set is: " +map.entrySet());
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> listFromMap=new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(listFromMap,new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}});
		 // put data from sorted list to hashmap
//		LinkedHashMap guarantees the insertion order of mappings. 
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : listFromMap) {
        	
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
	
		// TODO Auto-generated method stub
		
		
	}

}
