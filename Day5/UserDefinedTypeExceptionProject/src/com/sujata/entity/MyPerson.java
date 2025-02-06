package com.sujata.entity;

import java.util.Objects;

public class MyPerson implements Comparable<MyPerson> {

	private int pId;
	private String pName;
	private int pAge;
	
	public MyPerson() {
		
	}

	public MyPerson(int pId, String pName, int pAge) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(pAge, pId, pName);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPerson other = (MyPerson) obj;
		return pAge == other.pAge && pId == other.pId && Objects.equals(pName, other.pName);
	}

	@Override
	public int compareTo(MyPerson person) {
		if(this.equals(person))
			return 0;
		if(this.pAge>person.pAge)
			return 1;
		if(this.pAge<person.pAge)
			return -1;
		return 1;
	}
	
	
}
