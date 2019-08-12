/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：实体包
 * @Package: kh75.day1908010.soso.entity 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午5:18:23 
 */
package kh75.day1908010.soso.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ConsumInfo.java
* @Description: 消费记录
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午5:18:23 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class ConsumInfo {
	/**
	 * 卡号
	 */
	private String cardNumber;
	/**
	 * 消费类型
	 */
	private String type;
	/**
	 * 消费数据
	 */
	private int consumData;

	public ConsumInfo() {
	}

	public ConsumInfo(String cardNumber, String type, int consumData) {
		this.cardNumber = cardNumber;
		this.type = type;
		this.consumData = consumData;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the consumData
	 */
	public int getConsumData() {
		return consumData;
	}

	/**
	 * @param consumData the consumData to set
	 */
	public void setConsumData(int consumData) {
		this.consumData = consumData;
	}

	@Override
	public String toString() {
		return "ConsumInfo [cardNumber=" + cardNumber + ", type=" + type + ", consumData=" + consumData + "]";
	}

}
