package com.ajira.test.model;

import java.util.List;

import com.ajira.test.util.MopokenUtil;

public class Mopoken {
	
	private int id;
	private MopokenType type;
	private Integer level;
	private List<MopokenType> advantageList;
	
	public Mopoken(MopokenType type, int strength) {
		this.type = type;
		this.level = strength;
		this.advantageList = getAdvantageList(type);
	}

	private List<MopokenType> getAdvantageList(MopokenType type) {
		return MopokenUtil.getAdvantageList(type);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MopokenType getType() {
		return type;
	}

	public void setType(MopokenType type) {
		this.type = type;
	}

	

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<MopokenType> getAdvantageList() {
		return advantageList;
	}

	public void setAdvantageList(List<MopokenType> advantageList) {
		this.advantageList = advantageList;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if(obj instanceof Mopoken) {
			Mopoken m = (Mopoken)obj;
			if(this.getType()==m.getType() && this.getLevel() == m.getLevel()) {
				return true;
			}
		}
		return false;
	}
	
	

}
