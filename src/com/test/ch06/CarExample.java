package com.test.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		String company ="";
		String model ="";
		Car car = new Car();
		car.setCompany("현대");
		car.setModel("그랜저");
		System.out.println(car.toString());
		
		Car car2 = new Car("기아");
		System.out.println(car2.toString());
 
		Car car3 = new Car("테슬라","모델S","white");
		car3.setColor("Red");
		car3.setMaxSpeed(120);
		System.out.println(car3.toString());
		
		/*
		 * // String[] dueDateArr = new String[7]; // dueDateArr[0] = "06-01"; //
		 */		
		String[] dueDateArr = {"06-01","07-01","08-01","09-01","10-01","11-01","12-01"};
		car3.setDueDate(dueDateArr);
				
		
		car3.setMaxSpeed(200);
		System.out.println(car3.toString());
		
		car3.setMaxSpeed(300);
		System.out.println(car3.toString());
		
		

		
	}

}
