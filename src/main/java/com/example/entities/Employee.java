package com.example.entities;

public class Employee {

	private int id;
	private String name;
	private String age;
	private String dob;
	private String gender;
	private String city;
	private String email;

	public Employee() {
	}

	public Employee(String name, String age, String dob, String gender, String city, String email) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.city = city;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", gender=" + gender
				+ ", city=" + city + ", email=" + email + "]";
	}

}
