package com.dcl;

public class College {
	private int id;
	private String name;
	private String university;
	private String principal;
	private double fee;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
		}
	
	public void setUniversity(String university) {
		this.university=university;
		}
	
	public void setPrincipal(String principal) {
		this.principal=principal;
		}
	public void setFee(double fee) {
		this.fee=fee;
		}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getUniversity() {
		return university;
	}
	
	public String getPrincipal() {
		return principal;
	}
	
	public double getFee() {
		return fee;
	}
}

