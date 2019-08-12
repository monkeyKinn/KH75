/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.class_test.son 
 * @author: 金聖聰   
 * @date: 2019年8月6日 上午11:05:15 
 */
package kh75.day190806.class_test.son;

import kh75.day190806.class_test.PlayWiring;
import kh75.day190806.class_test.father.Handset;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CommonHandset.java
* @Description: 普通手机
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 上午11:05:15 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class CommonHandset extends Handset implements PlayWiring{

	/**   
	* @Function: CommonHandset.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:22:32 
	*/
	public CommonHandset(String brand, String type) {
		super.setBrand(brand);
		super.setType(type);
	}

	/** 
	* @see kh75.day190806.class_test.PlayWiring#play(java.lang.String)  
	* @Function: CommonHandset.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:07:41 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void play(String content) {
		System.out.println(content);
	}

}
