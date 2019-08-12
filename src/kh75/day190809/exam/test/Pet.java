/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:15:51 
 */
package kh75.day190809.exam.test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Pet.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:15:51 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public abstract class Pet {
	private int health = 50;

	/**
	 * @return the love
	 */
	public int getHealth() {
		return health;
	}

	public abstract void eat(); 
	
	/**
	 * @param love the love to set
	 */
	public void setHealth(int love) {
		this.health = love;
	}
}
