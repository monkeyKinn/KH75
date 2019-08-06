/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.service.impl 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:26:30 
 */
package kh75.day190806.afterschool_exercises.no11.service.impl;

import kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TapePlayer.java
* @Description: 录音机（播放磁带）
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:26:30 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class TapePlayer implements IMediaPlayerable {

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#play()  
	* @Function: TapePlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:26:30 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void play() {
		System.out.println("开始播放收听..青雪故事之盗墓笔记之活死人墓..");

	}

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#stop()  
	* @Function: TapePlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:26:30 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void stop() {
		System.out.println("太可怕了,暂停,抽根烟...");
	}

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#open()  
	* @Function: TapePlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:26:30 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void open() {
		System.out.println("收音机磁带开仓,,天亮了,不听了,留着明天听,放三上老师旁边...");
	}

}
