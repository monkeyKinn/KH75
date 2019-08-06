/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.class_test.father 
 * @author: 金聖聰   
 * @date: 2019年8月2日 上午9:20:21 
 */
package kh75.day190801.class_test.father;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Pet.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月2日 上午9:20:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月2日     金聖聰           v1.0.0               修改原因
*/
public abstract class Pet {
	private String name;
	private int health;
	private int love;
	
	public abstract void toHospital();
	/**   
	* @Function: Pet.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:36:51 
	*/
	public Pet() {
	}
	/**   
	* @Function: Pet.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:36:42 
	*/
	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
	}
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
	* @see java.lang.Object#toString()  
	* @Function: Pet.java
	* @Description: toString方法
	*
	* @param:　null
	* @return：String
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:22:11 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月2日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Pet [name=" + name + ", health=" + health + ", love=" + love + "]";
	}

	
}
