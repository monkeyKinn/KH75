/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190731.afterschool_exercises.classreview.entity 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午4:59:51 
 */
package kh75.day190731.afterschool_exercises.classreview.entity;

import static org.junit.Assert.*;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: DogTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午4:59:51 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class DogTest {
	/*	我们希望用更少的行数来为我们的属性赋值；我们可以利用构造方法
			来为属性赋值，初始化对象的时候就为属性赋值*/
	@Test
	public void test01() {
		Dog dog = new Dog("二哈",99);
		Dog dog1 = new Dog("阿黄", 88, "哈士奇");
		Dog dog2= new Dog();
		dog.name="玩彩";
		dog.love = 99;
		dog.show();
		dog1.show();
		dog2.show();
	}
}
