package kh75.day190801.class_core.entity;

public class Dog extends Pet {
	private String strain;

	public Dog(int health) {
		System.out.println("子类的无参数构造方法....");
	}

	public Dog(int health, int love, String name, int score, int age, int height) {
		super(health, love, name, score, age, height);
	}

	public Dog() {
	}

	public Dog(String name, int health) {
		super(name, health);// 显式调用 隐式调用
		System.out.println("子类的有参数构造方法....");
	}

	public Dog m() {
		return new Dog();
	}

	public Dog(String strain) {
		System.out.println("子类的有参构造方法....");

		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public String toString() {
		return "Dog [strain=" + strain + "]";
	}

	public void show() {
		// System.out.println(name);// private:同包中不可以使用
		System.out.println(score);// public: 同包中可以使用
		System.out.println(age);// default: 同包中可以使用
		System.out.println(height);// protected: 同包中可以使用
	}

	public void method() {
		super.method();
		System.out.println("品种：" + strain);
	}

}
