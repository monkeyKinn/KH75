/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.afterschool_exercises.car_rental.son 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午5:55:23 
 */
package kh75.day190801.afterschool_exercises.car_rental.son;

import kh75.day190801.afterschool_exercises.car_rental.father.Pet;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Penguin.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午5:55:23 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public class Penguin extends Pet{
	private String sex = "Q仔";

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

	/** 
	* @see java.lang.Object#toString()  
	* @Function: Penguin.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:55:55 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Penguin [sex=" + sex + "]";
	}

	/**   
	* @Function: Penguin.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:55:59 
	*/
	public Penguin(String name, int health, int love) {
		super(name, health, love);
	}

	/**   
	* @Function: Penguin.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:56:04 
	*/
	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}
	public Penguin() {}
	public void print(){
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",性别是 "+getSex());
	}
	
	public void swimming(){
		System.out.println();
		System.out.println("和主人游泳ing...");
		this.setHealth(this.getHealth()-10);
		this.setLove(this.getLove()+5);
	}
}
