/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：实体包
 * @Package: kh75.day1908010.soso.entity 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午5:08:40 
 */
package kh75.day1908010.soso.service.impl;

import kh75.day1908010.soso.entity.MobileCard;
import kh75.day1908010.soso.exception.MyException;
import kh75.day1908010.soso.service.INetService;
import kh75.day1908010.soso.service.ServicePackage;
import kh75.day1908010.soso.utils.CardUtil;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: NetPackage.java
* @Description: 网虫套餐
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午5:08:40 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class NetPackage extends ServicePackage implements INetService {
	/**
	 * 上网流量
	 */
	private int flow;

	public NetPackage() {
		this.flow = 3 * 1024;
		super.setPrice(68.0);
	}

	public NetPackage(int flow) {
		this.flow = flow;
	}

	public NetPackage(int flow, double price) {
		super(price);
		this.flow = flow;
	}

	@Override
	public void showInfo() {
		System.out.println(this.toString());
	}

	/**
	 * @return the flow
	 */
	public int getFlow() {
		return flow;
	}

	/**
	 * @param flow the flow to set
	 */
	public void setFlow(int flow) {
		this.flow = flow;
	}

	@Override
	public String toString() {
		return "网虫套餐 : 上网流量为" + flow / 1024 + "GB/月, 月资费为" + super.getPrice() + "元/月";
	}

	/** 
	* @see kh75.day1908010.soso.service.INetService#netPlay(int, kh75.day1908010.soso.entity.MobileCard)  
	* @Function: NetService.java
	* @Description: 上网计费
	*
	* @param: flow 上网流量,card 超出套餐内的流量时长时,需要消费那哪卡的余额
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:07:54 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public int netPlay(int flow, MobileCard card) {
		int temp = flow;
		for (int i = 0; i < flow; i++) {
			if (this.flow - card.getRealFlow() >= 1) {
				// 第一种情况:套餐剩余流量可以支持上网1MB
				card.setRealFlow(card.getRealFlow() + 1);// 实际流量数据加1
			} else if (card.getMoney() >= 0.1) {
				// 第二种情况:套餐流量已经用完,账户余额可以支付1MB流量,使用账户余额支付
				card.setRealFlow(card.getRealFlow() + 1);// 实际使用流量1MB
				// 账户余额0.1元(1条额外短信)
				card.setMoney(CardUtil.INSTANCE.sub(card.getMoney(), 0.1));
				card.setConsumAmount(card.getConsumAmount() + 0.1);
			} else {
				temp = 1;// 实际流量数
				throw new MyException("本次已使用" + i + "MB流量,您的余额不足,请充值后在使用!");
			}
		}
		return temp;
	}

}
