/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190731.afterschool_exercises.classreview.entity 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午3:53:10 
 */
package kh75.day190731.afterschool_exercises.classreview.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dog.java
* @Description: 练习构法+方法重载
*					概念:2同1不通:同类+同方法名,不同参数列表(顺序,个数,数据类型)
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午3:53:10 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Dog {
	String name;
	int health;
	int love;
	String strain;
	
	/**
	 * 
	* @Function: Dog.java
	* @Description: Dog的无参构造
	*
	* @param:　null
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午4:17:54
	 */
	public Dog(){
		System.out.println("I'm is no-param construction");
	}
	public Dog(String name,int love){
		this.name = name;
		this.love = love;
	}
	public Dog(String name,int love,String strain){
		this.name = name;
		this.love = love;
		this.strain = strain;
	}
	/**
	 * 
	* @Function: Dog.java
	* @Description: 方法重载
	*
	* @param: a,name
	* @return：string
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午4:58:17 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月1日     金聖聰           v1.0.0               修改原因
	 */
	public String m(int a, String name){
		return null;
	}
	public String m(String name){
		return null;
	}
	public void show() {
		System.out.println("宠物的独白");
		System.out.println("姓名是：" + name + ",健康值是：" + health + ",亲密度是：" + love + ",品种是：" + strain);
	}
}
