/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：汽车租凭父类包
 * @Package: kh75.day190801.afterschool_exercises.car_rental.father 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午2:41:50 
 */
package kh75.day190801.afterschool_exercises.car_rental.father;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MotoVehicle.java
* @Description: 汽车租凭父类抽象类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午2:41:50 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public abstract class MotoVehicle {
	/**
	 * 车牌号
	 */
	private String no;
	/**
	 * 品牌
	 */
	private String brand;
	/**
	 * 颜色
	 */
	private String color;
	/**
	 * 里程
	 */
	private int mileage;

	/**   
	* @Function: MotoVehicle.java
	* @Description: MotoVehicle的无参构造
	*
	* @param:　null
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午2:47:43 
	*/
	public MotoVehicle() {
	}

	/**   
	* @Function: MotoVehicle.java
	* @Description: MotoVehicle的有参构造
	*
	* @param:　no 车牌号,brand 品牌,color 颜色,mileage 里程
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午2:48:18 
	*/
	public MotoVehicle(String no, String brand, String color, int mileage) {
		this.no = no;
		this.brand = brand;
		this.color = color;
		this.mileage = mileage;
	}

	/**
	 * 
	* @Function: MotoVehicle.java
	* @Description: 计算租金
	*
	* @param: days租的天数
	* @return：租金
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午2:52:59 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	 */
	public abstract int calcRent(int days);

	/**
	 * @return the no
	 */
	public String getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	

	
	/** 
	* @see java.lang.Object#toString()  
	* @Function: MotoVehicle.java
	* @Description: 重写toString
	*
	* @param:　null
	* @return：机动车的信息
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月5日 下午2:46:13 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月5日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "MotoVehicle [no=" + no + ", brand=" + brand + ", color=" + color + ", mileage=" + mileage + "]";
	}

}
