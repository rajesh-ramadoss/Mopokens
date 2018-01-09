package com.ajira.test.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.ajira.test.model.MopokenType;

public class MopokenUtil {

	private static HashMap<MopokenType, List<MopokenType>> advMap = new HashMap<MopokenType, List<MopokenType>>();
	
	static
	{	
		advMap.put(MopokenType.FIRE, Arrays.asList(MopokenType.GRASS, MopokenType.GHOST));
		advMap.put(MopokenType.WATER, Arrays.asList(MopokenType.FIRE));
		advMap.put(MopokenType.GRASS, Arrays.asList(MopokenType.ELECTRIC, MopokenType.FIGHTING));
		advMap.put(MopokenType.ELECTRIC, Arrays.asList(MopokenType.WATER));
		advMap.put(MopokenType.PSYCHIC, Arrays.asList(MopokenType.GHOST));
		advMap.put(MopokenType.GHOST, Arrays.asList(MopokenType.FIGHTING, MopokenType.FIRE, MopokenType.ELECTRIC));
		advMap.put(MopokenType.FIGHTING, Arrays.asList(MopokenType.ELECTRIC));
		
	}
	
	
	public  static List<MopokenType> getAdvantageList(MopokenType type) {
		return advMap.get(type);
	}

	
}
