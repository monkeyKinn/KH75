/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年8月2日 上午9:44:29 
 */
package kh75.day190801.class_test.test;

import org.junit.Test;

import kh75.day190801.class_test.father.People;
import kh75.day190801.class_test.father.Pet;
import kh75.day190801.class_test.son.Cat;
import kh75.day190801.class_test.son.Dog;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: PetTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月2日 上午9:44:29 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月2日     金聖聰           v1.0.0               修改原因
*/
public class PetTest {
	@Test
	public void test1() throws Exception {
		Pet p = new Dog("母");
//		Pet p = new Cat("母");
		People people = new People();
		p.setHealth(59);
		people.goHospital(p);
		System.out.println(p.getName()+","+p.getHealth()+","+p.getLove()+",");
		
	}
}
