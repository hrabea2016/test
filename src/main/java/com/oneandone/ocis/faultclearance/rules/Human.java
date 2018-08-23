package com.oneandone.ocis.faultclearance.rules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Human implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer age;
	private java.lang.String before;
	private java.lang.String name;

	public Human() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getBefore() {
		return this.before;
	}

	public void setBefore(java.lang.String before) {
		this.before = before;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public Human(java.lang.Integer age, java.lang.String before, java.lang.String name) {
		this.age = age;
		this.before = before;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((before == null) ? 0 : before.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (before == null) {
			if (other.before != null)
				return false;
		} else if (!before.equals(other.before))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", before=" + before + ", name=" + name + "]";
	}

}