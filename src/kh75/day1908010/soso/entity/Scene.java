/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：实体包
 * @Package: kh75.day1908010.soso.entity 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午5:13:58 
 */
package kh75.day1908010.soso.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Seene.java
* @Description: 使用场景
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午5:13:58 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class Scene {
	/**
	 * 场景类型
	 */
	private String type;
	/**
	 * 场景消费数据
	 */
	private int data;
	/**
	 * 场景描述
	 */
	private String description;
	
	public Scene() {
	}
	
	public Scene(String type, int data, String description) {
		this.type = type;
		this.data = data;
		this.description = description;
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
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/** 
	* @see java.lang.Object#toString()  
	* @Function: Scene.java
	* @Description: 该函数的功能描述
	*
	* @param:　描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午6:36:31 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "Scene [type=" + type + ", data=" + data + ", description=" + description + "]";
	}
	
}
