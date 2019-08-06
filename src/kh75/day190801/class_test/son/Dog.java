/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.class_test.son 
 * @author: 金聖聰   
 * @date: 2019年8月2日 上午9:22:39 
 */
package kh75.day190801.class_test.son;

import kh75.day190801.class_test.father.Pet;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dog.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月2日 上午9:22:39 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月2日     金聖聰           v1.0.0               修改原因
*/
public class Dog extends Pet{
	private String strain;

	/**   
	* @Function: Dog.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:37:22 
	*/
	public Dog() {
	}

	/**   
	* @Function: Dog.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:37:10 
	*/
	public Dog(String strain) {
		this.strain = strain;
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
	* @date: 2019年8月2日 上午9:23:11 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月2日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Dog [strain=" + strain + "]";
	}
	@Override
	public void toHospital() {
		System.out.println("狗看病疗养");
		setHealth(getHealth() + 10);
	}
	
}
