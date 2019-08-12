/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：服务包
 * @Package: kh75.day1908010.soso.service 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午7:00:10 
 */
package kh75.day1908010.soso.service;

import kh75.day1908010.soso.entity.MobileCard;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: NetService.java
* @Description: 上网服务
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午7:00:10 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public interface INetService {
	/**
	 * 
	* @Function: NetService.java
	* @Description: 上网计费
	*
	* @param: flow 上网流量,card 超出套餐内的流量时长时,需要消费那哪卡的余额
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:00:57 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	int netPlay(int flow, MobileCard card);
}
