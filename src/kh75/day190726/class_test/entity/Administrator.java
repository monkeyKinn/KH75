/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190726.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年7月26日 上午11:00:52 
 */
package kh75.day190726.class_test.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Administrator.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月26日 上午11:00:52 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月26日     金聖聰           v1.0.0               修改原因
*/
public class Administrator {
	String name ;
	String passWord ;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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


	public void getInfo() {
		System.out.println("Name:"+getName()+",Password:"+getPassWord());
	}
}
