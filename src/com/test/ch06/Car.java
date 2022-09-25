package com.test.ch06;

public class Car {



	private String company = "현대";
	private String model ="카니발";
	private String color ="흰색";
	private int maxSpeed = 350;
	private int speed;
	private int price;
	private String realDate;
	
	private String[] dueDate;
	static int count =0;
	

	public String[] getDueDate() {
		return dueDate;
	}
	public void setDueDate(String[] dueDate) {
		switch(count) {
		case 0 :
			this.realDate = dueDate[0];
			break;
		case 1 :
			this.realDate = dueDate[0];
			break;
		case 2 :
			this.realDate = dueDate[0];
			break;  
		case 3 :
			this.realDate = dueDate[0];
			break;
		case 4 :
			this.realDate = dueDate[0];
			break;
		case 5 :
			this.realDate = dueDate[0];
			break;
		}

		
		for(String value : dueDate) {
			 System.out.println(value);
		}
		this.dueDate = dueDate;
	}
	
	public Car() {
		count++;
	}
	public Car(String company) {
		this.company = company;
		count++;
	}
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		count++;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		// Speed 따라서 가격 책정
		decisionPrice(maxSpeed);
		this.maxSpeed = maxSpeed;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	 
	public String toString() {
		String returnVal = "";
		returnVal = "company: " + this.company + "\n"
				+ "model: " + this.model + "\n"
				+ "color: " + this.color + "\n"
				+ "maxSpeed: " + this.maxSpeed + "\n"
				+ "speed: " + this.speed + "\n"
				+ "price: " + this.price + "\n"
			    + "count: " + this.count + "\n";
		return returnVal;
	}
	  	
	private void decisionPrice(int maxSpeed) {

		if(maxSpeed < 150) {
			this.price=1000;
		}else if(maxSpeed < 200){
			this.price =2000;
		}else if(maxSpeed < 250){
			this.price =3000;
		}else {
			this.price = 0;
		}
		this.speed=maxSpeed;
		
	}
	
	private void decisionPriceCase(int maxSpeed) {
		switch(maxSpeed){
		case 100 : this.price = 500; break;
		case 150 : this.price = 1000; break;
		case 200 : this.price = 1500; break;
		case 250 : this.price = 2000; break;
		case 300 : this.price = 2500; break;
		default: this.price =0;break;
		}
	}
	
}
