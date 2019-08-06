/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.afterschool_exercises.car_rental.father 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午5:48:25 
 */
package kh75.day190801.afterschool_exercises.car_rental.father;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Pet.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午5:48:25 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public class Pet {
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 健康值
	 */
	private int health = 50;
	/**
	 * 亲密度
	 */
	private int love = 50;
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
	* @Function: Pet.java
	* @Description: 有参构造
	*
	* @param:　name 名字,health 健康值, love 亲密度
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:48:52 
	*/
	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
	}
	/**   
	* @Function: Pet.java
	* @Description: 无参构造
	*
	* @param:　null
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:49:43 
	*/
	public Pet() {	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: Pet.java
	* @Description: tostring 覆写
	*
	* @param:　null
	* @return：宠物信息
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:50:35 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Pet [name=" + name + ", health=" + health + ", love=" + love + "]";
	}
	
}
