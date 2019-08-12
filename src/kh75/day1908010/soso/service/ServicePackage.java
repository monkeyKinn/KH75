/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：服务包
 * @Package: kh75.day1908010.soso.father 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午5:22:26 
 */
package kh75.day1908010.soso.service;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ServicePackage.java
* @Description: 品牌套餐父类,类的共同属性,方法
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午5:22:26 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class ServicePackage {
	/**
	 * 月资费
	 */
	private double price;
	
	public ServicePackage() {
	}

	public ServicePackage(double price) {
		this.price = price;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public void showInfo(){
		System.out.println("ServicePackage类信息");
	}

	@Override
	public String toString() {
		return "ServicePackage [price=" + price + "]";
	}
	
}
