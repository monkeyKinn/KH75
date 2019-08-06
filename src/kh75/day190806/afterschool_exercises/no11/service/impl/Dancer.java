/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.service.impl 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:58:30 
 */
package kh75.day190806.afterschool_exercises.no11.service.impl;

import kh75.day190806.afterschool_exercises.no11.service.IPerformerable;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dancer.java
* @Description: 舞蹈员
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:58:30 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class Dancer implements IPerformerable {

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IPerformerable#perform()  
	* @Function: Dancer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:58:30 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void perform() {
		System.out.println("迈克尔杰克逊~Come On~");
	}

}
