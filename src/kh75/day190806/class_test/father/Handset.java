/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.class_test.father 
 * @author: 金聖聰   
 * @date: 2019年8月6日 上午11:02:03 
 */
package kh75.day190806.class_test.father;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Handset.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 上午11:02:03 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class Handset {
	/**
	 * 牌子
	 */
	private String brand;
	/**
	 * 类型
	 */
	private String type;
	public void sendInfo(){
		System.out.println("发送文字");
	}
	public void call(){
		System.out.println("打电话");
	}
	public void info(){
		
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
	* @Function: Handset.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:21:01 
	*/
	public Handset(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	/**   
	* @Function: Handset.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 上午11:21:10 
	*/
	public Handset() {
	}
	
}
