package com.ajira.test.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MopokenDemo {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String firstInput = input.nextLine();
		String secondInput = input.next();
		
		
		
		MopokenDemo demo = new MopokenDemo();
		
		List<Mopoken> teamOne = demo.generateMopokens(firstInput);
		List<Mopoken> teamTwo = demo.generateMopokens(secondInput);	
		
		
	}
	
	 public List<Mopoken> generateMopokens(String input) {
	        List<Mopoken> mopokens = new ArrayList<>();
	        
	            String[] pokeStrings = input.split(";");
	            for (String pokeString : pokeStrings) {
	                String[] MopokenParams = pokeString.split("#");
	                MopokenType mopokenType = MopokenType.valueOf(MopokenParams[0].toUpperCase());
	                Integer level = new Integer(MopokenParams[1]);
	                System.out.println("mopoken type="+mopokenType);
	                System.out.println("mopoken level="+level);
	                Mopoken Mopoken = new Mopoken(mopokenType, level);
	                mopokens.add(Mopoken);
	            }
	            return mopokens;	        
	    }

	
}
