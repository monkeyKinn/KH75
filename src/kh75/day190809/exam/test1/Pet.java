/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test1 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:27:15 
 */
package kh75.day190809.exam.test1;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Pet.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:27:15 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public abstract class Pet {
	private String name;
	private int health=50;
	private int love=50;
	private String sex;
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
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * @return the love
	 */
	public int getLove() {
		return love;
	}
	/**
	 * @param love the love to set
	 */
	public void setLove(int love) {
		this.love = love;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	abstract void play();
}
