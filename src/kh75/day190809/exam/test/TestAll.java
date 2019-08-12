/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午8:51:05 
 */
package kh75.day190809.exam.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestAll.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午8:51:05 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class TestAll {
	@Test
	public void test01() throws Exception {
		// 打印三角形
		/*       *          4个空格    1个星
		 		***         3个空格    3个星
		       *****        2个空格    5个星
		      *******       1个空格    7个星
		     *********      0        8
		*/
		for (int i = 1; i < 6; i++) {// 循环5次画5行
			for (int j = 0; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			// 打印回车 每循环一行回车一次
			System.out.println();
		}
	}
	@Test
	public void test02() throws Exception {
		Pet p = new Dog();
//		Pet p = new Penguin();
		p.setHealth(50);
		p.eat();
		System.out.println(p.getHealth());
	}
}
