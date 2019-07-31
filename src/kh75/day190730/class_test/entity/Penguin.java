/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190730.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年7月30日 下午12:19:11 
 */
package kh75.day190730.class_test.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Penguin.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 下午12:19:11 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class Penguin {
	private String name = "qq";
	private int health = 100;
	private int love = 20;
	private String sex = "Q仔";
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * @param love the love to set
	 */
	public void setLove(int love) {
		this.love = love;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print(){
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",性别是 "+getSex());
	}
	/**   
	* @Function: Penguin.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月30日 下午12:27:56 
	*/
	public Penguin() {
	
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @return the love
	 */
	public int getLove() {
		return love;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	
	
	
}
