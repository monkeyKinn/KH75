/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.service 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:22:43 
 */
package kh75.day190806.afterschool_exercises.no11.service;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: IMediaPlayerable.java
* @Description: 表示家庭影院的一个设备
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:22:43 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public interface IMediaPlayerable {
	/**
	 * 
	* @Function: IMediaPlayerable.java
	* @Description: 播放、
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:23:57 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	 */
	void play();
	/**
	 * 
	* @Function: IMediaPlayerable.java
	* @Description: 停止
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:24:04 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	 */
	void stop();
	/**
	 * 
	* @Function: IMediaPlayerable.java
	* @Description: 和开仓
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午3:24:13 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	 */
	void open();
}
