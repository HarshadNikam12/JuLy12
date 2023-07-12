package com.tech;

public class Employee 
{
	private int eid;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoin;
	private double sallary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoin() {
		return yearOfJoin;
	}
	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}
	public double getSallary() {
		return sallary;
	}
	public void setSallary(double sallary) {
		this.sallary = sallary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoin=" + yearOfJoin + ", sallary=" + sallary + "]";
	}
	public Employee(int eid, String name, int age, String gender, String department, int yearOfJoin, double sallary) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoin = yearOfJoin;
		this.sallary = sallary;
	}
	
	
	
	

}
