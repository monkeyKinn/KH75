/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190731.afterschool_exercises.classreview.entity2 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午5:07:21 
 */
package kh75.day190731.afterschool_exercises.classreview.entity2;

import static org.junit.Assert.*;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CatTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午5:07:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class CatTest {
	@Test
	public void test1() {
		Cat c = new Cat();
		c.name = "tomcat";
		c.setHealth(-199);
		c.show();
		System.out.println(c.getHealth());
	}
}
