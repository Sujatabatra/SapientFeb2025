package com.sujata.demo;

public class EggConvertor {

	private int totalNoOfEggs;
	private Unit eggs;
	
	public void setTotalNoOfEggs(int totalNoOfEggs) {
		this.totalNoOfEggs = totalNoOfEggs;
	}
	public Unit getEggs() {
		return eggs;
	}
	
	public void convert() {
		eggs=new Unit();
		eggs.setGross(totalNoOfEggs/144);
		eggs.setDozen(totalNoOfEggs%144/12);
		eggs.setRemaining(totalNoOfEggs%12);
	}
	
}
