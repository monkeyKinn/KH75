/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.class_test.son 
 * @author: 金聖聰   
 * @date: 2019年8月2日 上午9:37:55 
 */
package kh75.day190801.class_test.son;

import kh75.day190801.class_test.father.Pet;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Cat.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月2日 上午9:37:55 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月2日     金聖聰           v1.0.0               修改原因
*/
public class Cat extends Pet {
	private String sex;

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
	* @Function: Cat.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:39:50 
	*/
	public Cat(String sex) {
		this.sex = sex;
	}

	/**   
	* @Function: Cat.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:39:55 
	*/
	public Cat() {
	}

	/** 
	* @see java.lang.Object#toString()  
	* @Function: Cat.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月2日 上午9:39:59 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月2日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Cat [sex=" + sex + "]";
	}

	/** 
	* @see kh75.day190801.class_test.father.Pet#toHospital()  
	* @Function: Cat.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月3日 下午4:36:03 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月3日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void toHospital() {
		System.out.println("猫看病疗养");
		setHealth(getHealth() + 10);
	}

}
