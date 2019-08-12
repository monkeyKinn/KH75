/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：实体包
 * @Package: kh75.day1908010.soso.entity 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午5:11:14 
 */
package kh75.day1908010.soso.service.impl;

import kh75.day1908010.soso.entity.MobileCard;
import kh75.day1908010.soso.exception.MyException;
import kh75.day1908010.soso.service.ICallService;
import kh75.day1908010.soso.service.INetService;
import kh75.day1908010.soso.service.ISendService;
import kh75.day1908010.soso.service.ServicePackage;
import kh75.day1908010.soso.utils.CardUtil;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: SuperPackage.java
* @Description: 超人套餐
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午5:11:14 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class SuperPackage extends ServicePackage implements ICallService,ISendService,INetService{
	/**
	 * 通话时长
	 */
	private int talkTime;
	/**
	 * 短信条数
	 */
	private int smsCount;
	/**
	 * 上网流量
	 */
	private int flow;

	public SuperPackage() {
		this.talkTime = 200;
		this.flow = 1*1024;
		this.smsCount = 50;
		super.setPrice(78);
	}

	public SuperPackage(int talkTime, int smsCount, int flow, double price) {
		super(price);
		this.talkTime = talkTime;
		this.smsCount = smsCount;
		this.flow = flow;
	}
	

	public SuperPackage(int talkTime, int smsCount, int flow) {
		this.talkTime = talkTime;
		this.smsCount = smsCount;
		this.flow = flow;
	}

	@Override
	public void showInfo() {
		System.out.println(this.toString());
	}

	/**
	 * @return the talkTime
	 */
	public int getTalkTime() {
		return talkTime;
	}

	/**
	 * @param talkTime the talkTime to set
	 */
	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}

	/**
	 * @return the smsCount
	 */
	public int getSmsCount() {
		return smsCount;
	}

	/**
	 * @param smsCount the smsCount to set
	 */
	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
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
		return "超人套餐 : 通话时长为" + talkTime + "分钟/月, 短信条数为:" + smsCount + "条/月, 上网流量为:" + flow/1024 + "GB/月,月资费为"
				+ super.getPrice() + "元/月";
	}

	/** 
	* @see kh75.day1908010.soso.service.INetService#netPlay(int, kh75.day1908010.soso.entity.MobileCard)  
	*@Function: NetService.java
	* @Description: 上网计费
	*
	* @param: flow 上网流量,card 超出套餐内的流量时长时,需要消费那哪卡的余额
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:06:20 
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
			if (this.flow-card.getRealFlow()>=1) {
				//第一种情况:套餐剩余流量可以支持上网1MB
				card.setRealFlow(card.getRealFlow()+1);//实际流量数据加1
			}else if(card.getMoney()>=0.1){
				//第二种情况:套餐流量已经用完,账户余额可以支付1MB流量,使用账户余额支付
				card.setRealFlow(card.getRealFlow()+1);//实际使用流量1MB
									//账户余额0.1元(1条额外短信)
				card.setMoney(CardUtil.INSTANCE.sub(card.getMoney(), 0.1));
				card.setConsumAmount(card.getConsumAmount()+0.1);
			}else{
				temp = 1;//实际流量数
				throw new MyException("本次已使用"+i+"MB流量,您的余额不足,请充值后在使用!");
			}
		}
		return temp;
	}

	/** 
	* @see kh75.day1908010.soso.service.ISendService#send(int, kh75.day1908010.soso.entity.MobileCard)  
	*  @Function: SendService.java
	* @Description: 短信计费
	*
	* @param: count 短信条数,card 超出套餐内的短信条数,需要消费那哪卡的余额
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:06:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public int send(int count, MobileCard card) {
		int temp = count;
		for (int i = 0; i < count; i++) {
			if (this.smsCount-card.getRealSMSCount()>=1) {
				//第一种情况:套餐剩余短信条数可以支持发送1条
				card.setRealSMSCount(card.getRealSMSCount()+1);//实际短信数据加1
			}else if(card.getMoney()>=0.1){
				//第二种情况:套餐短信条数已经用完,账户余额可以支付1条短信,使用账户余额支付
				card.setRealSMSCount(card.getRealSMSCount()+1);//实际使用短信1分钟
									//账户余额0.1元(1条额外短信)
				card.setMoney(CardUtil.INSTANCE.sub(card.getMoney(), 0.1));
				card.setConsumAmount(card.getConsumAmount()+0.1);
			}else{
				temp = 1;//实际短信数
				throw new MyException("本次已发送"+i+"条短信,您的余额不足,请充值后在使用!");
			}
		}
		return temp;
	}

	/** 
	* @see kh75.day1908010.soso.service.ICallService#call(int, kh75.day1908010.soso.entity.MobileCard)  
	* @Function: ICallService.java
	* @Description: 通话计费
	*
	* @param: minCount 通话分钟数,card 超出套餐内的通话时长时,需要消费那哪卡的余额
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:06:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public int call(int minCount, MobileCard card) {
		int temp = minCount;
		for (int i = 0; i < minCount; i++) {
			if (this.talkTime-card.getRealTalkTime()>=1) {
				//第一种情况:套餐剩余通话时长可以支持1分钟通话
				card.setRealTalkTime(card.getRealTalkTime()+1);//实际通话数据加1
			}else if(card.getMoney()>=0.2){
				//第二种情况:套餐通话时长已经用完,账户余额可以支付1分钟的通话,使用账户余额支付
				card.setRealTalkTime(card.getRealTalkTime()+1);//实际使用通话时长1分钟
									//账户余额0.2元(1分钟额外通话)
				card.setMoney(CardUtil.INSTANCE.sub(card.getMoney(), 0.2));
				card.setConsumAmount(card.getConsumAmount()+0.2);
			}else{
				temp = 1;//实际通话分钟数
				throw new MyException("本次已通话"+i+"分钟,您的余额不足,请充值后在使用!");
			}
		}
		return temp;
	}

}
