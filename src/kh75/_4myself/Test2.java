/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75._4myself 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午6:17:03 
 */
package kh75._4myself;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Test2.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午6:17:03 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Test2 {
	int age;
	String name;
	void init() {
		age = 10;
		name = "limy";
	}
	public Test2() {
	}
	public Test2(String name) {
		this.init();// age=10 name =limy
		this.name = name;//name = 你好
	}
	public Test2(String name, int age) {
		this(name);
		this.init();//age = 10;name = limy
		this.age = age;//age = 18
	}
	public static void main(String[] args) {
		Test2 t = new Test2("你好",18);
		System.out.print(t.name);
		System.out.print(t.age);
		
	}
}
