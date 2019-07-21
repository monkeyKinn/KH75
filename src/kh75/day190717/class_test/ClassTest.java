/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190717.class_test 
 * @author: 金聖聰   
 * @date: 2019年7月17日 下午2:18:21 
 */
package kh75.day190717.class_test;

import java.util.Scanner;
import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ClassTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月17日 下午2:18:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月17日     金聖聰           v1.0.0               修改原因
*/
public class ClassTest {
	Scanner in = new Scanner(System.in);

	/**
	 * 
	* @Function: ClassTest.java
	* @Description: 打印50份卷子
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月17日 下午2:20:17 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月17日     金聖聰           v1.0.0               修改原因
	 */
	@Test
	public void test01() {
		int i = 1;
		while (i <= 50) {
			System.out.println("打印第" + i + "份试卷");
			i++;
		}
	}

	@Test
	public void test02() {
		System.out.print("合格否?(Y/N):");
		String isOk = in.next();
		while ("N".equals(isOk)) {
			System.out.println("上午看书下午撸代码");
			System.out.print("合格否?(Y/N):");
			isOk = in.next();
		}
		System.out.println("Good Job!");
	}

	@Test
	public void test03() {
		int num = 0;
		int people = 25_0000;
		while (people <= 100_0000) {
			people *= (1 + 0.25);
			num++;
		}
		num += 2012;
		System.out.println(num);
	}

	@Test
	public void test04() {
		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println();
		System.out.println("******************************");
		System.out.println("请选择购买的商品编号:");
		System.out.println("1. T恤      2.网球鞋      3.网球拍");
		System.out.println("******************************");
		while (true) {
			System.out.println("输入商品编号:");
			if (in.hasNextInt()) {// 是整型
				int num = in.nextInt();
				switch (num) {
				case 1:
					System.out.println("T恤    245元");

					break;
				case 2:
					System.out.println("网球鞋    300元");
					break;
				case 3:
					System.out.println("网球拍     100元");
					break;
				default:
					System.out.println("输入错误");
				}
				System.out.println("是否继续(y/n)");
				String isContinue = in.next();
				if ("y".equals(isContinue)) {
					continue;
				} else {
					return;
				}
			} else {// 不是整型
				System.out.println("输入的不是整型,请重新输入!");
				in.next();
			}
		}
	}

	@Test
	public void test05() {// 100所有偶数的和
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	@Test
	public void test06() {//摄氏度转华氏度
		System.out.println('a'+1);//a=97 = 65 + 32
		System.out.println('A'+1);//A=65
		int centigrade = 0;// 摄氏度;
		double fahrenheit = 0.0;// 华氏度
		int count = 1;
		do {
			fahrenheit = (centigrade * 9) / 5.0 + 32;
			System.out.println("摄氏度:" + centigrade + "\t" + "华氏度:" + fahrenheit);
			centigrade += 20;
			count++;
		} while (count <= 10);
	}
}
