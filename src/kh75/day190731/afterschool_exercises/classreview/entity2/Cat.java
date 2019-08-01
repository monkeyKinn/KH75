/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190731.afterschool_exercises.classreview.entity2 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午5:04:01 
 */
package kh75.day190731.afterschool_exercises.classreview.entity2;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Cat.java
* @Description: 联系封装
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午5:04:01 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Cat {
	String name;
	private int health;
	int love;
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
		if (health <0||health>100) {
			System.out.println("Error input ,default is 60");
			this.health = 60;
		} else {
			this.health = health;
		}
	}
	public void show(){
		System.out.println("宠物的独白");
		System.out.println("姓名是："+name+",健康值是："+health+",亲密度是："+love);
	}
	
}
