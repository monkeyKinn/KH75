/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：服务包
 * @Package: kh75.day1908010.soso.service 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午6:56:17 
 */
package kh75.day1908010.soso.service;

import kh75.day1908010.soso.entity.MobileCard;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: SendService.java
* @Description: 短信服务
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午6:56:17 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public interface ISendService {
	/**
	 * 
	* @Function: SendService.java
	* @Description: 短信计费
	*
	* @param: count 短信条数,card 超出套餐内的短信条数,需要消费那哪卡的余额
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午6:58:23 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	int send(int count,MobileCard card);
}
