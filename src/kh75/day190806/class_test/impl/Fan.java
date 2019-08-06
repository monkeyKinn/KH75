/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.class_test.impl 
 * @author: 金聖聰   
 * @date: 2019年8月6日 上午9:59:49 
 */
package kh75.day190806.class_test.impl;

import kh75.day190806.class_test.IUSB;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Fan.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 上午9:59:49 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class Fan implements IUSB {

	/** 
	* @see kh75.day190806.class_test.IUSB#service()  
	* @Function: Fan.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午9:59:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void service() {
		System.out.println("大风车转转转....");
	}

}
