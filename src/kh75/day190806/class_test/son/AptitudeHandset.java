/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.class_test.son 
 * @author: 金聖聰   
 * @date: 2019年8月6日 上午11:04:42 
 */
package kh75.day190806.class_test.son;

import kh75.day190806.class_test.NetWork;
import kh75.day190806.class_test.PlayWiring;
import kh75.day190806.class_test.TheakePictures;
import kh75.day190806.class_test.father.Handset;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: AptitudeHandset.java
* @Description: 智能手机
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 上午11:04:42 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class AptitudeHandset extends Handset implements NetWork,TheakePictures,PlayWiring{

	/**   
	* @Function: AptitudeHandset.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:24:32 
	*/
	public AptitudeHandset(String brand, String type) {
		super.setBrand(brand);
		super.setType(type);
	}

	/** 
	* @see kh75.day190806.class_test.TheakePictures#takePictures()  
	* @Function: AptitudeHandset.java
	* @Description: 拍照
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:06:23 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void takePictures() {
		System.out.println("卡擦,美颜完成");
	}

	/** 
	* @see kh75.day190806.class_test.NetWork#network()  
	* @Function: AptitudeHandset.java
	* @Description: 联网
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:06:23 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void network() {
		System.out.println("开启5G");
	}

	/** 
	* @see kh75.day190806.class_test.PlayWiring#play(java.lang.String)  
	* @Function: AptitudeHandset.java
	* @Description: 播放
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:07:54 
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
