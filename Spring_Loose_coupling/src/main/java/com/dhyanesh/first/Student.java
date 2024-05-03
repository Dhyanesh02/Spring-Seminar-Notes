package com.dhyanesh.first;

public class Student {
	private Cheat cheat;
	private String id;

	Student(Cheat cheat,String id){
		this.cheat =cheat;
		this.id = id;
		System.out.println("Constructor called");
	}
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public void setCheat(Cheat cheat) {
//		this.cheat = cheat;
//	}

	public void cheating() {
		System.out.println("ID :" +id);
		cheat.cheat();
	}

}

