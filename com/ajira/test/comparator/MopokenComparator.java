package com.ajira.test.comparator;

import java.util.Comparator;

import com.ajira.test.model.Mopoken;
import com.ajira.test.util.MopokenUtil;

public class MopokenComparator implements Comparator<Mopoken> {

	@Override
	public int compare(Mopoken o1, Mopoken o2) {

		if(o1.getType() == o2.getType()) {
			if(o1.getLevel() == o2.getLevel()) {
				return 0;
			}else if(o1.getLevel() > o2.getLevel()) {
				return 1;
			}else {
				return -1;
			}				
		}
        if (o2.getLevel() > (2 * o1.getLevel())) {
            return -1;
        }
        else if (o1.getLevel() > (2 * o2.getLevel())) {
            return 1;
        }else if (o1.getLevel() == ( 2 * o2.getLevel())) {
        	return 0;
        }else if(MopokenUtil.getAdvantageList(o1.getType()).contains(o2.getType())) {
        	return 1; 
        }else if(MopokenUtil.getAdvantageList(o2.getType()).contains(o1.getType())) { 
			return -1;		 
        }
        return -1;
	}
	
	

}
