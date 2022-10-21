package com.jspiders;

class Student {
	private int id;
	private String name;
	private String email;

	public Student(int id, String name, String email) {

		this.id = id;
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MavenTest [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}

class MavenTest {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Rahul", "rahul@gmail.com");
		System.out.println(s1);
	}
}
