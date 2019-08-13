/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190813.class_test.test01 
 * @author: 金聖聰   
 * @date: 2019年8月13日 上午8:46:58 
 */
package kh75.day190813.class_test.test01;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Student.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月13日 上午8:46:58 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月13日     金聖聰           v1.0.0               修改原因
*/
public class Student {
	private Gender gender;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.setGender(Gender.男);
		System.out.println(s.getGender());
	}
}
