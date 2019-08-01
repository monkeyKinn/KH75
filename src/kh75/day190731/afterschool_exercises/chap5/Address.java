/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：Chap5练习包
 * @Package: kh75.day190731.afterschool_exercises.chap5 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午6:45:35 
 */
package kh75.day190731.afterschool_exercises.chap5;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Address.java
* @Description: Chap5第二题 地址类
*	创建一个Address 类，描述如下： 
		1） 该类有两个属性，
			1）String 类型的address，表示地址；
			2）String 类型的zipCode，表示邮编。 
		2） 该类有两个构造方法，
			一为无参构造方法，
			一为带三个参数的方法。
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午6:45:35 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Address {
	/**
	 * 地址
	 */
	String address;
	/**
	 * 邮编
	 */
	String zipCode;
	/**   
	* @Function: Address.java
	* @Description: 无参构造
	*
	* @param:　没有
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午6:48:34 
	*/
	public Address() {
		
	}
	/**   
	* @Function: Address.java
	* @Description: 有参构造
	*
	* @param:　address 地址,zipCode 邮编
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午6:48:54 
	*/
	public Address(String address, String zipCode) {
		this.address = address;
		this.zipCode = zipCode;
	}
	
	
}
