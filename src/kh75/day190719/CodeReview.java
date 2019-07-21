/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190719 
 * @author: 金聖聰   
 * @date: 2019年7月19日 上午11:48:51 
 */
package kh75.day190719;

import java.util.Scanner;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CodeReview.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月19日 上午11:48:51 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月19日     金聖聰           v1.0.0               修改原因
*/
public class CodeReview {
	Scanner sc = new Scanner(System.in);;

	@Test
	public void test05() {
		double count1 = 0;// 统计30岁以上的
		for (int i = 1; i <= 10; i++) {
			double age = 0;
			System.out.print("请输入第" + i + "个人年龄：");
			age = sc.nextDouble();
			if (age >= 30) {
				count1++;
			}
		}
		double present = (count1 / 10) * 100;
		System.out.println("大于30岁的比例为：" + present + "%");
		System.out.println("小于30岁的比例为：" + (100 - present) + "%");
		System.out.println("程序结束！");
		System.out.println("----------------------------");
	}

	@Test
	public void test01() {
		int a = 2147483647;
		// a = a + 1;
		System.out.println(a);
		int b = -2147483648;
		// b-=1;
		System.out.println(b);
		System.out.println("----------------------------");
		int c = a - b;// a+1 = b ==> a-b =-1 2147483647+2147483648>
		if (c > 0) {// 5-4> 0 ==>5 big
			System.out.println("a is Bigger");
		} else {
			System.out.println("b is bigger");
		}

	}

}
