/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190726.afterschool_exercises.test 
 * @author: 金聖聰   
 * @date: 2019年7月26日 上午9:48:21 
 */
package kh75.day190726.class_test.test;

import kh75.day190726.class_test.entity.Student;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestStudent.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月26日 上午9:48:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月26日     金聖聰           v1.0.0               修改原因
*/
public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.age = 10;
		s.name = "张三疯";
		s.no = 1;
		s.getMessages();
		
		Student s1 = new Student();
		s1.age = 101;
		s1.name = "张三";
		s1.no = 11;
		s1.getMessages();
	}
}
