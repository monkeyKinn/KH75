package kh75.day190731.class_test.entity2;
/**
 *   static:  静态的，可以修饰属性，方法和代码块
 *   		 执行顺序：随着类的加载而加载 ，优先于其他的方法和属性的顺序
 *          试想饮水机：是公共的，大家可用的，推荐实用static
 *          水杯一般都是没人一个，这里就不推荐使用static
 *          
 *       修饰方法:
 *         普通方法： 普通方法调用普通方法是可以,也是可以调用静态方法
 *         静态方法：静态方法可以调用静态方法，不可以调用普通方法
 *         在静态方法中不能实用this关键字
 *          
 *        
 *
 */
public class Person {

	String name;
	int age;
	static String country;
	
	public void s1(){
		s2();
		m1();
		System.out.println("s1...");
	}
	public void s2(){
		System.out.println(name);
		System.out.println(this.name);
		System.out.println("s2...");
	}
	
	public static void m1(){
//		System.out.println(name);
//		System.out.println(this.name);
		m2();
		//s1();
		System.out.println("m1...");
	}
	public static void m2(){
		System.out.println("m2...");
	}
	
	
	
	
	
	
	public Person(){}
	
	public Person(String name,int age,String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}
	
	public void show(){
		System.out.println("姓名是："+name+",年龄是："+age+",国籍 是："+country);
	}
	
	
}
