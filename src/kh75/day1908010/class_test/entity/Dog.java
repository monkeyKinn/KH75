/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day1908010.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午2:52:47 
 */
package kh75.day1908010.class_test.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dog.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午2:52:47 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class Dog {
	private String name;
	private String strain;
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
	* @Function: Dog.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午2:55:25 
	*/
	public Dog(String name, String strain) {
		this.name = name;
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
	* @date: 2019年8月10日 下午2:58:42 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Dog [name=" + name + ", strain=" + strain + "]";
	}
	
}
