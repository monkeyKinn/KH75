/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.service.impl 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:25:11 
 */
package kh75.day190806.afterschool_exercises.no11.service.impl;

import kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: DVDPlayer.java
* @Description: 表示 DVD 播放器
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:25:11 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class DVDPlayer implements IMediaPlayerable {

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#play()  
	* @Function: DVDPlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:25:11 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void play() {
		System.out.println("DVD 开始播放三上悠亚作品...");
	}

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#stop()  
	* @Function: DVDPlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:25:11 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void stop() {
		System.out.println("播放停止....圣贤模式开启...");
	}

	/** 
	* @see kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable#open()  
	* @Function: DVDPlayer.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:25:11 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public void open() {
		System.out.println("开仓.....取出DVD,藏在箱底..");
	}

}
