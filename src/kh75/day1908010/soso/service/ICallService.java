/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：服务包
 * @Package: kh75.day1908010.soso.service 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午6:47:20 
 */
package kh75.day1908010.soso.service;

import kh75.day1908010.soso.entity.MobileCard;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CallService.java
* @Description: 通话服务接口
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午6:47:20 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public interface ICallService {
	/**
	 * 
	* @Function: ICallService.java
	* @Description: 通话计费
	*
	* @param: minCount 通话分钟数,card 超出套餐内的通话时长时,需要消费那哪卡的余额
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	 * @return 
	* @date: 2019年8月10日 下午6:53:25 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	int call(int minCount,MobileCard card);
}
