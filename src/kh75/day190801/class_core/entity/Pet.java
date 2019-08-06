package kh75.day190801.class_core.entity;

public class Pet {
	private int health;
	private int love;
	private String name;
	public int score;
	int age;
	protected int height;

	public Pet(int health, int love, String name, int score, int age, int height) {

		this.health = health;
		this.love = love;
		this.name = name;
		this.score = score;
		this.age = age;
		this.height = height;
	}

	public Pet() {
		System.out.println("父类的无构造...");
	}

	public Pet(String name, int health) {
		System.out.println("父类的有参数构造方法....");
		this.name = name;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public void show() {

		System.out.println("pet...show()");
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", health=" + health + ", love=" + love + "]";
	}

	public void method() {
		System.out.println("姓名" + name + ",健康值" + health + ",亲密度" + love);

	}

	public Pet m() {
		return new Pet();
	}

}
