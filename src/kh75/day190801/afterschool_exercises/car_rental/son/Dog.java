/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.afterschool_exercises.car_rental.son 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午5:52:11 
 */
package kh75.day190801.afterschool_exercises.car_rental.son;

import kh75.day190801.afterschool_exercises.car_rental.father.Pet;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dog.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午5:52:11 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public class Dog extends Pet{
	/**
	 * 类型
	 */
	private String strain;

	/**
	 * @return the strain
	 */
	public String getStrain() {
		return strain;
	}

	/**
	 * @param strain the strain to set
	 */
	public void setStrain(String strain) {
		this.strain = strain;
	}

	/** 
	* @see java.lang.Object#toString()  
	* @Function: Dog.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:52:33 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Dog [strain=" + strain + "]";
	}

	/**   
	* @Function: Dog.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:56:48 
	*/
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	/**   
	* @Function: Dog.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:56:59 
	*/
	public Dog(String name, int health, int love) {
		super(name, health, love);
	}
	public Dog() {}
	public void print() {
		System.out
				.println("我的名字叫" + getName() + ",健康值是" + getHealth() + ",和主人的亲密度是" + getLove() + ",我是一只" + getStrain());
	}
	public void catchingFlyDisc(){
		System.out.println();
		System.out.println("和主人玩飞盘ing....");
		this.setHealth(this.getHealth()-10);
		this.setLove(this.getLove()+5);
	}
}
