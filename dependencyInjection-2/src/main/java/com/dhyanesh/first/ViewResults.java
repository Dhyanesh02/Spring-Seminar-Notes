package com.dhyanesh.first;

public class ViewResults {

	private String rollno;
	private Results results;
	
	public void setRollno(String rollno) {
		this.rollno=rollno;
	}
	
	public void setResults(Results results) {
		this.results = results;
	}
	public void testResults() {
		results.resultGrade(rollno);
	}
	
}
