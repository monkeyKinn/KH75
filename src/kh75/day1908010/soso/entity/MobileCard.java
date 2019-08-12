/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：实体包
 * @Package: kh75.day1908010.soso.entity 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午4:58:57 
 */
package kh75.day1908010.soso.entity;

import kh75.day1908010.soso.service.ServicePackage;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MobileCard.java
* @Description: 搜搜移动卡
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午4:58:57 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class MobileCard {
	/**
	 * [卡号]
	 */
	private String cardNumber;
	/**
	 * [用户名]
	 */
	private String userName;
	/**
	 * [密码]
	 */
	private String passWord = "123";
	/**
	 * [所属套餐]
	 */
	private ServicePackage servicePackage;
	/**
	 * [当月消费金额 ]
	 */
	private double consumAmount;
	/**
	 * [账户余额 ]
	 */
	private double money;
	/**
	 * [当月实际通话时长 ]
	 */
	private int realTalkTime;
	/**
	 * [当月实际发送短信条数]
	 */
	private int realSMSCount;
	/**
	 * [当月实际上网流量]
	 */
	private int realFlow;

	@Override
	public String toString() {
		return "卡号:" + cardNumber + ", 用户名:" + userName + ", 密码:" + passWord
				+", 当月消费:" + consumAmount + "元, 账户余额:" + money + "元, 当月实际通话时长:" + realTalkTime
				+ "分钟,当月 实际短信条数" + realSMSCount + "条, 当月实际上网流量" + realFlow + "GB";
	}
	
	
	public MobileCard() {
	}

	public MobileCard(String cardNumber, String userName, String passWord, ServicePackage servicePackage,
			double consumAmount, double money, int realTalkTime, int realSMSCount, int realFlow) {
		this.cardNumber = cardNumber;
		this.userName = userName;
		this.passWord = passWord;
		this.servicePackage = servicePackage;
		this.consumAmount = consumAmount;
		this.money = money;
		this.realTalkTime = realTalkTime;
		this.realSMSCount = realSMSCount;
		this.realFlow = realFlow;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @return the servicePackage
	 */
	public ServicePackage getServicePackage() {
		return servicePackage;
	}

	/**
	 * @param servicePackage the servicePackage to set
	 */
	public void setServicePackage(ServicePackage servicePackage) {
		this.servicePackage = servicePackage;
	}

	/**
	 * @return the consumAmount
	 */
	public double getConsumAmount() {
		return consumAmount;
	}

	/**
	 * @param consumAmount the consumAmount to set
	 */
	public void setConsumAmount(double consumAmount) {
		this.consumAmount = consumAmount;
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * @return the realTalkTime
	 */
	public int getRealTalkTime() {
		return realTalkTime;
	}

	/**
	 * @param realTalkTime the realTalkTime to set
	 */
	public void setRealTalkTime(int realTalkTime) {
		this.realTalkTime = realTalkTime;
	}

	/**
	 * @return the realSMSCount
	 */
	public int getRealSMSCount() {
		return realSMSCount;
	}

	/**
	 * @param realSMSCount the realSMSCount to set
	 */
	public void setRealSMSCount(int realSMSCount) {
		this.realSMSCount = realSMSCount;
	}

	/**
	 * @return the realFlow
	 */
	public int getRealFlow() {
		return realFlow;
	}

	/**
	 * @param realFlow the realFlow to set
	 */
	public void setRealFlow(int realFlow) {
		this.realFlow = realFlow;
	}

	public void showMeg(){
		System.out.println(this.toString());
		servicePackage.showInfo();
	}
	
	

}
