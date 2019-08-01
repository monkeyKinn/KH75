/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190731.class_test 
 * @author: 金聖聰   
 * @date: 2019年7月31日 下午4:15:44 
 */
package kh75.day190731.class_test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Test.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月31日 下午4:15:44 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月31日     金聖聰           v1.0.0               修改原因
*/
public class Test {
	static String country;
	private String name;
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Test t = new Test();
		Test.country = "你好";
		System.out.println(Test.country);
		Test.country="he";
		System.out.println(Test.country);
		t.setAge(11);
		System.out.println(t.getAge());
	}
}
