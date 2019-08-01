package kh75.day190731.class_test.entity;

/**
 * 我们实用构造方法来初始化值（作用）
 * 构造方法事一个特殊的方法
 * 语法：  修饰符  类名（）{}
 * 
 * 测试的时候 对象的实例化的时候，括号里面的参数需要和对于的实体类中的
 * 构造方法保持一致（个数，数据类型以及顺序）
 * 
 * 当没有有参构造方法的时候，系统给我们提供无参构造方法，
 * 当有了有参的构造方法的时候，系统就不再给我们提供无参构造方法了
 * 建议：编写完类以后，有参无参构造方法都写
 * 
 *
 */

/**
 *    重载：
 *     能够自动的去匹配对应的方法，不需要特地回头去写相应的方法
 *    
 *    概念：方法名相同，参数列表不同(顺序，数据类型或者事个数不同),
 *    		和返回值类型以及访问修饰符无关
 *
 */

public class Dog {

	String name;
	int health;
	int love;
	String strain;

	// 类似于这样没有参数的构造方法称为无参构造方法
	// 系统会默认给我们提供，在new对象的时候被调用
	public Dog() {
		System.out.println("我是无参构造方法.....");
	}

	public Dog(String name, int love) {
		this.name = name;
		this.love = love;
	}

	public Dog(String name, int love, String strain) {
		this.name = name;
		this.love = love;
		this.strain = strain;
	}

	public String m(int a, String name) {
		return null;
	}

	public String m(String name) {
		return null;
	}

	public void show() {
		System.out.println("宠物的独白");
		System.out.println("姓名是：" + name + ",健康值是：" + health + ",亲密度是：" + love + ",品种是：" + strain);
	}
}
