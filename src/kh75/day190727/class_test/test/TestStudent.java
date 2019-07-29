/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190727.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年7月27日 下午5:38:10 
 */
package kh75.day190727.class_test.test;

import kh75.day190727.class_test.entity.StudentBiz;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestStudent.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月27日 下午5:38:10 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月27日     金聖聰           v1.0.0               修改原因
*/
public class TestStudent {
	public static void main(String[] args) {
		StudentBiz sb = new StudentBiz();
		sb.addStudent(sb.getName());
	}
}
