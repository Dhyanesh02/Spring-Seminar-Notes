package com.dhyanesh.first;

public class Student {
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}


	MathCheating mathcheating;
	
	

	public void setMathcheating(MathCheating mathcheating) {
		this.mathcheating = mathcheating;
	}


	 public void cheating() {
		 mathcheating.mathCheating();
	 }
	 public void printid() {
		 System.out.println(id);
	 }
}
