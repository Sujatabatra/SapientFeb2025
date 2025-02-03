package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Scoda;

public class CarRentalSystem {

	public static void main(String[] args) {
		BMW bmw=new BMW("Blue", "Q6");
		Audi audi=new Audi("Red", "A8");
		Scoda scoda=new Scoda("Silver", "Slavia");
		
		Driver sonu=new Driver("Sonu");
		Driver ramesh=new Driver("Ramesh");
		Driver suresh=new Driver("Suresh");
		Driver monu=new Driver("Monu");
		
		suresh.setCar(bmw);
		suresh.drive();

	}

}
