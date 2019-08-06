package kh75.day190801.class_core.entity;

public class Car {
	public static void main(String[] args) {
		Bus bus = new Bus(20);
		bus.print();
	}

	private int site = 4; // 座位数

	Car() {
		System.out.println("载客量是" + site + "人");
	}

	public void setSite(int site) {
		this.site = site;
	}

	public void print() {
		System.out.print("载客量是" + site + "人");
	}

}

class Bus extends Car {
	Bus(int site) {
		//隐式调用   super()
		setSite(site);
	}
}
