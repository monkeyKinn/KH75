/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.afterschool_exercises.car_rental.utils 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午5:00:28 
 */
package kh75.day190801.afterschool_exercises.car_rental.utils;

import kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CarsUtlis.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午5:00:28 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public enum CarsUtlis {
	INSTANCE;
	/**
	 * 
	* @Function: MotoVehicle.java
	* @Description: 计算总租金
	*
	* @param: 机动车数组,天数
	* @return：总租金
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午4:49:38 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	 */
	public int calcTotalRent(MotoVehicle[] motos,int days){
	       int totalRent = 0; 
	       for(int i=0;i<motos.length;++i){
	            totalRent += motos[i].calcRent(days);
	       } 
	       return totalRent;
	}
}
