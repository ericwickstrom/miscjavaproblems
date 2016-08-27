package com.beardsmcgee.misc.countletter;
/*
 * Write an example that counts the number of times a particular character, 
 * such as e, appears in a file. The character can be specified at the command line. 
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountLetter {
	
	private HashMap<String, Integer> map;
	
	public CountLetter(String file){
		Scanner scanner = null;
		Pattern pattern = Pattern.compile("[A-Za-z]");
		map = new HashMap<>();
		try {
			scanner = new Scanner(new FileReader(file));
			scanner.useDelimiter("");
			while(scanner.hasNext()){
				String s = scanner.next();
				Matcher m = pattern.matcher(s);
				if(m.matches()){
					s = s.toLowerCase();
					if(map.containsKey(s)){
						int total = map.get(s);
						map.put(s, ++total);
					} else {
						map.put(s, 0);
					}
				}
			}
				
		}  catch (Exception e){
			System.out.println(e);
		} finally {
			if(scanner != null){
				scanner.close();
			}
		}
	}

	public int count(String s){
		if(map.containsKey(s.toLowerCase())){
			return map.get(s.toLowerCase());
		}
		return 0;
	}
}
