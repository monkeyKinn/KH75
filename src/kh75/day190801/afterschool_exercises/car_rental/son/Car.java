/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：汽车租凭子类包
 * @Package: kh75.day190801.afterschool_exercises.car_rental.son 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午2:53:51 
 */
package kh75.day190801.afterschool_exercises.car_rental.son;

import kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Car.java
* @Description: 汽车租凭子类Car
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午2:53:51 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public final class Car extends MotoVehicle{
	/**
	 * 型号
	 */
	private String type;
	
	
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
	* @Function: Car.java
	* @Description: car的无参构造
	*
	* @param:　null
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午2:59:41 
	*/
	public Car() {	}
	


	/**   
	* @Function: Car.java
	* @Description: car的有参构造
	*
	* @param:　no 车牌号,type 型号
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午3:00:12 
	*/
	public Car(String no,String type) {
		super.setNo(no);
		this.type = type;
	}


	/** 
	* @see java.lang.Object#toString()  
	* @Function: Car.java
	* @Description: toString的重写
	*
	* @param:　null
	* @return：Car的信息
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午2:58:55 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Car [type=" + type + "]";
	}


	/** 
	* @see kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle#calcRent(int)  
	* @Function: Car.java
	* @Description: 计算租金
	*
	* @param:　days 租的天数
	* @return：租金
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午2:54:50 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public int calcRent(int days) {
		int sum = 0;
		if("商务舱GL8".equals(this.type)){
			sum = days*600;
		}else if("林荫大道".equals(this.type)){
			sum = days *300;
		}else if("宝马550i".equals(this.type)){
			sum = days*500;
		}
		return sum;
	}

}
