package com.ajira.test.model;

import java.util.ArrayList;
import java.util.List;
import com.ajira.test.model.Mopoken;

public class Breeder {

	private static List<Mopoken> mopokens = new ArrayList<Mopoken>();
	private boolean beFriend;
		
	
	
	public Breeder(Mopoken mopoken) {
		this.mopokens.add(mopoken);
	}	
	
	public List<Mopoken> getMopoken() {
		return mopokens;
	}

	public void setMopoken(List<Mopoken> mopoken) {
		this.mopokens = mopoken;
	}

	public boolean isBeFriend() {
		return beFriend;
	}

	public void setBeFriend(boolean beFriend) {
		this.beFriend = beFriend;
	}

	
}
