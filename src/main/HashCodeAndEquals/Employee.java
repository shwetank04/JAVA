package com.luv2code.hibernate.demo;

public class Employee {

	private int id;
	private String name;

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

	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) {
			return false;
		}
		if (o == this) { // when e1=e2
			return true;
		}
		Employee e = (Employee) o;
		return (this.getId() == e.getId() && this.getName() == e.getName());
	}

	public int hashCode() {
		return getId();
	}
}
