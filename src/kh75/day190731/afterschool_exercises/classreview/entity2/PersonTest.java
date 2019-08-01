/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190731.afterschool_exercises.classreview.entity2 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午5:10:51 
 */
package kh75.day190731.afterschool_exercises.classreview.entity2;

import org.junit.Test;



/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: PersonTest.java
* @Description: 
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午5:10:51 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class PersonTest {
	@Test
	public void tests01(){
		Person p1 = new Person("蔡徐坤",30,"中国");
		Person p2 = new Person("张宇",40,"中国");
		Person p3 = new Person("王威",30,"中国");
		p1.show();
		p2.show();
		p3.show();
		System.out.println("============");
		
		p3.country="泰国";
		p1.show();
		p2.show();
		p3.show();
	}
}
