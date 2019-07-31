/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190730.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年7月30日 上午10:15:48 
 */
package kh75.day190730.class_test.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Student.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 上午10:15:48 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class Student {
	private String name;
	private String gender;
	/** 
	* @see java.lang.Object#toString()  
	* @Function: Student.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月30日 上午10:45:15 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月30日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + "]";
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
