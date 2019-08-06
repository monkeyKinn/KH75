/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：汽车租凭子类包
 * @Package: kh75.day190801.afterschool_exercises.car_rental.son 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午5:12:32 
 */
package kh75.day190801.afterschool_exercises.car_rental.son;

import kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Truck.java
* @Description: 汽车租凭子类truck
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午5:12:32 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public class Truck extends MotoVehicle{
	private int tonnage;
	
	/**   
	* @Function: Truck.java
	* @Description: 有参构造
	*
	* @param:　吨位
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:14:33 
	*/
	public Truck(String no,int tonnage) {
		super.setNo(no);
		this.tonnage = tonnage;
	}

	/**   
	* @Function: Truck.java
	* @Description: 无参构造
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:14:56 
	*/
	public Truck() {
	}

	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	/** 
	* @see kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle#calcRent(int)  
	* @Function: Truck.java
	* @Description: 计算租金
	*
	* @param:　days 租的天数
	* @return：租金
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午5:15:41 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public int calcRent(int days) {
		int sum = 0;
		sum = days*this.tonnage*50;
		return sum;
	}
	
}
