/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190730.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年7月30日 上午11:27:26 
 */
package kh75.day190730.class_test.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Client.java
* @Description: 客户类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 上午11:27:26 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class Client {
	private String name;

	

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
	* @see java.lang.Object#toString()  
	* @Function: Client.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月30日 上午11:27:47 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月30日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return  name ;
	}
	
}
