package kh75.day190801.class_core.entity;

public class Penguin {
	private String sex;

	public Penguin() {
	}

	public Penguin(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Penguin [sex=" + sex + "]";
	}
}
