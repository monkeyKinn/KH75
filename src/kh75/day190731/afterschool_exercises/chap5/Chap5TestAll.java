/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：Chap5练习题包
 * @Package: kh75.day190731.afterschool_exercises.chep5 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午6:28:39 
 */
package kh75.day190731.afterschool_exercises.chap5;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Chap5.java
* @Description: Chap5 练习题测试类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午6:28:39 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Chap5TestAll {
	@Test
	public void testNo11() throws Exception {
		Worker w = new Worker();
		w.work();
		w.work(12);
		System.out.println(w.name);
		System.out.println(w.age);
		System.out.println(w.salary);
		Worker w2 = new Worker("金圣聪", 24, 12000);
		w2.work();
		w2.work(24);
		System.out.println(w2.name);
		System.out.println(w2.age);
		System.out.println(w2.salary);
	}

	@Test
	public void test13() throws Exception {
		Worker zhangsan = new Worker("zahngsan", 25, 2500);
		zhangsan.addr = new Address("北京市海淀区清华园1 号", "100084");
		System.out.println("--------------测试是否成功创建-----------");
		System.out.println(zhangsan.name);
		System.out.println(zhangsan.age);
		System.out.println(zhangsan.salary);
		System.out.println(zhangsan.addr.address);
		System.out.println(zhangsan.addr.zipCode);
	}

	@Test
	public void test15() throws Exception {
		System.out.println("-------------相加:传入虚数类------------");
		Complex complex = new Complex();
		complex.real = 1.5;
		complex.im = -3;
		Complex c = new Complex();
		c.real = 2.3;
		c.im = 2.4;
		System.out.println("实数:"+complex.add(c).real + "虚数:"+complex.add(c).im + "i");
		System.out.println("-------------相加:传入一个实数---------------");

		System.out.println("实数:"+complex.add(1.5).real + "虚数:"+complex.add(1.5).im + "i");
		System.out.println("-------------相减:传入虚数类------------");

		Complex c2 = new Complex();
		c2.real = 1.5;
		c2.im = 3;
		System.out.println("实数:"+complex.sub(c2).real + "虚数:"+complex.sub(c2).im + "i");
		System.out.println("-------------相乘:传入虚数类------------");
		Complex complex3 = new Complex();
		complex3.real = 3;
		complex3.im = 5;
		Complex c3 = new Complex();
		c3.real = 4;
		c3.im = 6;
		System.out.println("实数:"+complex3.mul(c3).real + "虚数:"+complex3.mul(c3).im + "i");

	}

}
