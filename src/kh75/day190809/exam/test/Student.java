/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:08:34 
 */
package kh75.day190809.exam.test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Student.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:08:34 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class Student {
	/**
	 * 需求:使用封装的思想实现对年龄的控制（只能输入1-120岁，输入其他的提示错误）
	 */
	//学号，
	private int sNo;
	//姓名，
	private String name;
	//年龄
	
	private int age;
	/**
	 * @return the sNo
	 */
	public int getsNo() {
		return sNo;
	}
	/**
	 * @param sNo the sNo to set
	 */
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 * 只能输入1-120岁，输入其他的提示错误
	 */
	public void setAge(int age) {
		if (age>=1 && age <=120) {
			this.age = age;
		} else {
			System.out.println("输入错误");
		}
	}
}
