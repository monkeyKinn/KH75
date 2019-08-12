/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test1 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:35:06 
 */
package kh75.day190809.exam.test1;

import static org.junit.Assert.*;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestGame.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:35:06 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class TestGame {
	@Test
	public void test01() throws Exception {
		Master master = new Master();
//		Pet p = new Dog();
		Pet p = new Penguin();
		master.game(p);
		System.out.println(p.getHealth()+" "+p.getLove());
	}
}
