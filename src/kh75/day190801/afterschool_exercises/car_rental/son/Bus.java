/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：汽车租凭子类包
 * @Package: kh75.day190801.afterschool_exercises.car_rental.son 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午3:02:05 
 */
package kh75.day190801.afterschool_exercises.car_rental.son;

import kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Bus.java
* @Description: 汽车租凭子类Bus
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午3:02:05 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public final class Bus extends MotoVehicle {
	/**
	 * 座位数
	 */
	private int seatCount;

	/**   
	* @Function: Bus.java
	* @Description: 公交车的无参构造
	*
	* @param:　null
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午3:04:29 
	*/
	public Bus() {
	}

	/**   
	* @Function: Bus.java
	* @Description: 公交车的有参构造
	*
	* @param:　seatCount 公交车的座位数
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午3:05:07 
	*/
	public Bus(String no, int seatCount) {
		super.setNo(no);
		this.seatCount = seatCount;
	}

	/**
	 * @return the seatCount
	 */
	public int getSeatCount() {
		return seatCount;
	}

	/**
	 * @param seatCount the seatCount to set
	 */
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	/** 
	* @see kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle#calcRent(int)  
	* @Function: Bus.java
	* @Description: 计算租金
	*
	* @param:　days 租的天数
	* @return：租金
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午3:02:21 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public int calcRent(int days) {
		int sum = 0;
		if (this.seatCount <= 16) {
			sum = days * 800;
		} else if (this.seatCount > 16) {
			sum = days * 1500;
		}
		return sum;
	}



}
