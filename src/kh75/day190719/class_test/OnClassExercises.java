/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课堂练习包
 * @Package: kh75.day190719.class_test 
 * @author: 金聖聰   
 * @date: 2019年7月19日 上午8:36:58 
 */
package kh75.day190719.class_test;

import java.util.Scanner;
import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: OnClassExercises.java
* @Description: 课堂练习类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月19日 上午8:36:58 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月19日     金聖聰           v1.0.0               修改原因
*/
public class OnClassExercises {
	Scanner in = new Scanner(System.in);

	@Test
	public void test01() {
		int a = 12345;
		int b = 0;
		System.out.print("翻转a:");
		while (a != 0) {
			b = a % 10;
			System.out.print(b);
			a = a / 10;
		}
	}

	@Test
	public void test02() {
		double sum = 0;
		boolean flag = false;
		System.out.println("名字:");
		String name = in.next();
		for (int i = 1; i <= 5; i++) {
			System.out.print("输入5门的第" + i + "门成绩:");
			if (in.nextDouble() < 0) {
				flag = true;
				System.out.println("Error");
				break;
			}
			sum += in.nextDouble();
		}
		if (flag) {
			System.out.println("输入错误再见");
		} else {
			System.out.println(name + "的平均分:" + sum / 5);
		}
	}

	@Test
	public void test03() {
		System.out.print("请输入一个数:");
		int num = in.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(i + "+" + (num - i) + "=" + num);
		}
	}

	@Test
	public void test04() {
		double notOver30Count = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("请输入第" + i + "位顾客的年龄");
			int age = in.nextInt();
			if (age < 30) {
				notOver30Count++;
			}
		}
		double percentNumOv30 = notOver30Count / 10 * 100;
		System.out.println("30以下" + percentNumOv30 + "%");
		System.out.println("30以上" + (100 - percentNumOv30) + "%");
		// System.out.println(age);
	}

	@Test
	public void test05() {// 求1~100之间不能被3整除的数之和
		int sum = 0;
		for (int i = 1; i <= 100; i++) {//
			if (i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("Sum=" + sum);
	}

	@Test
	public void test06() {// 计算100以内的奇数之和
		int sum = 0;
		for (int i = 1; i <= 100;) {
			sum += i;
			i += 2;
		}
		System.out.println("Sum=" + sum);
	}

	@Test
	public void test07() {// 验证登录
		final String USERNAME = "jim";
		final String USERPASSWORD = "123456";
		for (int i = 2; i >= 0; i--) {
			System.out.print("Name:");
			String name = in.next();
			System.out.print("PassWord:");
			String password = in.next();
			if (USERNAME.equals(name) && USERPASSWORD.equals(password)) {
				System.out.println("欢迎登录MyShopping OS");
				break;
			} else {
				if(i!=0){
					System.out.println("输入错误!还有" + i + "次机会");
				}else {
					System.out.println("对不起,您三次输入都错了,再见");
				}
				continue;
			}
		}

	}

}
