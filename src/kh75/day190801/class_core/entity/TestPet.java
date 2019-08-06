package kh75.day190801.class_core.entity;

import org.junit.Test;

/**
 *  继承：
 *     为什么需要继承？
 *     		提高代码的复用率，提高开发效率
 *     关键字 ： extends
 *     需要满足的条件：  is - a
 *     所有的类都有一个公共的父类：Object
 *     所有的类只能同时继承一个父类（单根继承）
 *     如：可以：        Dog  extends  Pet
 *       	     Dog  extends Object
 *       不能  	 Dog  extends  Pet，Object
 *    
	不能被继承的内容：
		在继承过程中，private 修饰的内容是不能被继承
				    在不同的包中，默认修饰符修饰的内容也是不能被继承
			     	构造方法是不能不继承
 *
 *
 * super: 使用在子父类中，调用父类中的属性，方法和构造方法
 * 			在构造方法中使用的时候，需要在第一行
 *
 */
/**
 * 
 *    在子类的构造方法中，如果我们没有具体的写调用父类的构造方法的话
 *    会默认调用父类的无惨构造方法
 *
 *   如果显式的调用父类的具体某个构造方法的话，
 *   则就会根据我们写的来调用对应的方法
 */
public class TestPet {
	@Test
	public void test02() {
		Dog dog = new Dog("xiaohua", 89);
	}

	@Test
	public void test01() {
		// Dog dog = new Dog();
		/*dog.setName("旺财");
		dog.setHealth(99);
		dog.setLove(100);
		dog.setStrain("田园犬");
		dog.method();*/
		// dog.Pet();
		/*String name = dog.getName();
		System.out.println(name);*/
	}
}
