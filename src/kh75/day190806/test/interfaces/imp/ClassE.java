/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.test.interfaces.imp 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午5:19:05 
 */
package kh75.day190806.test.interfaces.imp;

import kh75.day190806.test.interfaces.IA;
import kh75.day190806.test.interfaces.IC;
import kh75.day190806.test.interfaces.ID;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ClassE.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午5:19:05 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class ClassE implements ID {

	/** 
	* @see kh75.day190806.test.interfaces.IB#mb()  
	* @Function: ClassE.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午5:19:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void mb() {
		System.out.println("MB");

	}

	/** 
	* @see kh75.day190806.test.interfaces.IA#ma()  
	* @Function: ClassE.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午5:19:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void ma() {
		System.out.println("MA");

	}

	/** 
	* @see kh75.day190806.test.interfaces.IC#mc()  
	* @Function: ClassE.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午5:19:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void mc() {
		System.out.println("MC");

	}

	/** 
	* @see kh75.day190806.test.interfaces.ID#md()  
	* @Function: ClassE.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午5:19:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void md() {
		System.out.println("MD");

	}

	public static void main(String[] args) {

		IC ic = new ClassE();
		
		((IA) ic).ma();
	}
}
