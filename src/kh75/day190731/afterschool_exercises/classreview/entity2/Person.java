/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190731.afterschool_exercises.classreview.entity2 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午5:10:40 
 */
package kh75.day190731.afterschool_exercises.classreview.entity2;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Person.java
* @Description: static 无法访问非static方法,其他都可以,因为static是属于类的,而没有对象就没有this,所以static中不能有this
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午5:10:40 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Person {
	String name;
	int age;
	static String country;

	public Person(){}

	public Person(String name,int age,String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public void show(){
		System.out.println("姓名是："+name+",年龄是："+age+",国籍 是："+country);
	}
	
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
	
}
