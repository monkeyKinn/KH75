/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.service.impl 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:25:49 
 */
package kh75.day190806.afterschool_exercises.no11.service.impl;

import kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CDPlayer.java
* @Description: CD 播放器
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:25:49 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class CDPlayer implements IMediaPlayerable {

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#play()  
	* @Function: CDPlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:25:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void play() {
		System.out.println("CD开始播放ASMR...");
	}

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#stop()  
	* @Function: CDPlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:25:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void stop() {
		System.out.println("ASMR停止播放..圣贤模式又开启....");

	}

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#open()  
	* @Function: CDPlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:25:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void open() {
		System.out.println("开仓...CD取出,放在三上老师上面...");
	}

}
