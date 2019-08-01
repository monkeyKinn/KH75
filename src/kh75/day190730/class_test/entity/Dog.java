/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190730.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年7月30日 下午12:18:53 
 */
package kh75.day190730.class_test.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dog.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 下午12:18:53 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class Dog {
	private String name;
	private int health;
	private int love;
	private String strain;

	/**   
	* @Function: Dog.java
	* @Description: 空构造
	*
	* @param:　null
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月30日 下午12:22:45 
	*/
	public Dog() {
		this.name = "旺财";
		this.health = 100;
		this.love = 20;
		this.strain = "拉布拉多犬";
	}

	public Dog(String name,int health,int love, String strain){
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
	}
	

	public void print() {
		System.out
				.println("我的名字叫" + getName() + ",健康值是" + getHealth() + ",和主人的亲密度是" + getLove() + ",我是一只" + getStrain());
	}



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
		if (health > 100 || health < 0) {
			System.out.println("The health is between 0 and 100,The default of the health is 60");
			this.health = 60;
			return;
		}
		this.health = health;
	}

	/**
	 * @param love the love to set
	 */
	public void setLove(int love) {
		this.love = love;
	}

	/**
	 * @param strain the strain to set
	 */
	public void setStrain(String strain) {
		this.strain = strain;
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
	 * @return the strain
	 */
	public String getStrain() {
		return strain;
	}

}
